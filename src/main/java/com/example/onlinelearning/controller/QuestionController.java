package com.example.onlinelearning.controller;

import com.example.onlinelearning.domain.Question;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/08/10:42
 * @Description: 致敬
 */
@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @RequestMapping("/create")
    public ServiceResponse<Boolean> createQuestion(@RequestBody Question question){
        return questionService.createQuestion(question);
    }
}
