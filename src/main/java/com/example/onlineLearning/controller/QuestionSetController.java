package com.example.onlineLearning.controller;

import com.example.onlineLearning.models.QuestionSetCreation;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.QuestionSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/11/9:52
 * @Description: 致敬
 */
@RestController
@RequestMapping("/question_set")
public class QuestionSetController {
    @Autowired
    private QuestionSetService questionSetService;

    @RequestMapping("/create")
    public ServiceResponse<Boolean> createQuestionSet(@RequestBody QuestionSetCreation questionSetCreation) {
        return questionSetService.createQuestionSet(questionSetCreation);
    }
}
