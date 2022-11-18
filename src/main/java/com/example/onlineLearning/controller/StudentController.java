package com.example.onlineLearning.controller;

import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author: 作者
 * @Date: 2022/11/18/18:31
 * @Description: 致敬
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/importStudentData",method = RequestMethod.POST)
    public ServiceResponse<Boolean> importStudentData(@RequestParam("file") MultipartFile studentData) {
        ServiceResponse<Boolean> result = new ServiceResponse<Boolean>();
        try {
            if (studentData != null) {
                result = studentService.importStudentData(studentData.getInputStream(), studentData.getOriginalFilename());
            } else {
                System.out.println("studentData is empty.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
