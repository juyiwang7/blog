package com.hdu.blog.core.aspect;

import com.alibaba.fastjson.JSON;
import com.hdu.blog.core.annotation.LogAnnotation;
import com.hdu.blog.core.util.IpUtils;
import com.hdu.blog.entity.Log;
import com.hdu.blog.service.LogService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//日志管理 切面类
@Aspect
@Component
public class LogAspect {

    @Autowired
    LogService logService;

    @Pointcut("@annotation(com.hdu.blog.core.annotation.LogAnnotation)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long beginTime = System.currentTimeMillis();
        //执行方法
        Object result = point.proceed();
        //执行时长(毫秒)
        long time = System.currentTimeMillis() - beginTime;
        //保存日志
        saveLog(point, time,result);

        return result;
    }

    private void saveLog(ProceedingJoinPoint joinPoint, long time,Object result) {

        // 获取RequestAttributes
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        // 从获取RequestAttributes中获取HttpServletRequest的信息
        HttpServletRequest request = (HttpServletRequest) requestAttributes.resolveReference(RequestAttributes.REFERENCE_REQUEST);
        Log log = new Log();


        // 从切面织入点处通过反射机制获取织入点处的方法
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        // 获取切入点所在的方法
        Method method = signature.getMethod();
        log.setUrl(request.getRequestURI()); // 请求URI
        log.setCreateDate(new Date()); // 创建时间
        // 获取操作
        LogAnnotation logAnnotation = method.getAnnotation(LogAnnotation.class);
        if (logAnnotation != null) {
            log.setOperationModule(logAnnotation.module()); // 操作模块
            log.setOperationType(logAnnotation.type()); // 操作类型
            log.setOperationDescription(logAnnotation.description()); // 操作描述
        }
        // 获取请求的类名
        String className = joinPoint.getTarget().getClass().getName();
        // 获取请求的方法名
        String methodName = method.getName();
        methodName = className + "." + methodName;
        log.setMethodName(methodName); // 请求方法=类名+方法名
        log.setResponseParams(JSON.toJSONString(result)); // 返回结果
        log.setTimeTotal(time);
        log.setIp(IpUtils.getIpAddr(request)); // 请求IP
        //TODO: 请求的参数    获取不到！！
        Map<String, String> rtnMap = converMap(request.getParameterMap());
        // 将参数所在的数组转换成json
        String params = JSON.toJSONString(rtnMap);
        log.setRequestParams(params); // 请求参数

        //        log.setOperId(UuidUtil.get32UUID()); // 主键ID
        //TODO:获取当前用户
//        log.setUser_id(user_id); // 请求用户ID
//        log.setUsername(username); // 请求用户名称

        logService.addLog(log);
    }

    //转换request 请求参数
    public Map<String, String> converMap(Map<String, String[]> paramMap) {
        Map<String, String> rtnMap = new HashMap<String, String>();
        for (String key : paramMap.keySet()) {
            rtnMap.put(key, paramMap.get(key)[0]);
        }
        return rtnMap;
    }


}
