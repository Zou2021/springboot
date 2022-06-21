package com.zou.controller;

import com.zou.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 邹祥发
 * @date: 2022/6/20 20:40
 */
@RestController
@Slf4j
public class HelloWorldController {

    @RequestMapping(path = "hi", method = RequestMethod.GET)
    public String hi() {
        return "helloworld,service is : " + getServiceImpl();
    }

    @Lookup
    public ServiceImpl getServiceImpl() {
        //下面的日志会输出么？
        log.info("executing this method");
        return null;
    }

}