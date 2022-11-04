package com.example.onlinelearning.controller;

import com.example.onlinelearning.domain.QuestionBaseInfo;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 作者
 * @Date: 2022/11/03/17:00
 * @Description: 致敬
 */
@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @RequestMapping("/test")
    public String test(){
        return "test success!";
    }
    @PostMapping ("/createQuestion")
    public ServiceResponse<Boolean> createQuestion(@RequestBody QuestionBaseInfo questionBaseInfo){
        return questionService.createQuestion(questionBaseInfo);
    }
}
