package com.zou.controller;

import com.zou.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 邹祥发
 * @date: 2022/6/22 20:49
 */
@RestController
@Slf4j
@Validated
public class StudentController {
    @Autowired
    DataService dataService;

    @RequestMapping(path = "students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable("id") int id) {
        dataService.deleteStudent(id);
    }

}