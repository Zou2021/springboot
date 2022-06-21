package com.zou.service.impl;

import org.springframework.stereotype.Service;

/**
 * @author: 邹祥发
 * @date: 2022/6/21 19:14
 */
@Service
public class ServiceImpl {
    private String serviceName;
    public ServiceImpl(String serviceName) {
        this.serviceName = serviceName;
    }
    public ServiceImpl(String serviceName, String otherStringParameter) {
        this.serviceName = serviceName;
    }
}