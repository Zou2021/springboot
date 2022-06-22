package com.zou.service.impl;

import com.zou.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author: 邹祥发
 * @date: 2022/6/22 20:53
 */
@Repository
@Slf4j
public class DataServiceImpl implements DataService {
    @Override
    public void deleteStudent(int id) {
        log.info("delete student info maintained by oracle");
    }
}