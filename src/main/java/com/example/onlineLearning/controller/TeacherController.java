package com.example.onlineLearning.controller;

import com.example.onlineLearning.domain.Teacher;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/18/16:18
 * @Description: 致敬
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @RequestMapping("/create")
    public ServiceResponse<Boolean> create(@RequestBody Teacher teacher) {
        return teacherService.create(teacher);
    }
}
