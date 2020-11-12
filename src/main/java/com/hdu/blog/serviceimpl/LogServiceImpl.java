package com.hdu.blog.serviceimpl;

import com.hdu.blog.entity.Log;
import com.hdu.blog.mapper.LogMapper;
import com.hdu.blog.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    LogMapper logMapper;

    @Override
    public void addLog(Log log) {
        logMapper.addLog(log);
    }
}
