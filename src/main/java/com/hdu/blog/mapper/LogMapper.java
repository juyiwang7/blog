package com.hdu.blog.mapper;

import com.hdu.blog.entity.Log;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LogMapper {
    void addLog(Log log);
}
