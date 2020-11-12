package com.hdu.blog.service;

import com.hdu.blog.entity.Log;
import org.springframework.stereotype.Service;


public interface LogService {
    void addLog(Log log);
}
