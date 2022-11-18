package com.example.onlineLearning.controller;

import com.example.onlineLearning.domain.Class;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/18/16:49
 * @Description: 致敬
 */
@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;
    @RequestMapping("/create")
    public ServiceResponse<Boolean> create(@RequestBody Class c) {
        return classService.create(c);
    }
}
