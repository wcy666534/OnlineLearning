package com.example.onlinelearning.controller;

import com.example.onlinelearning.domain.Question;
import com.example.onlinelearning.domain.QuestionSet;
import com.example.onlinelearning.models.QuestionSetCreation;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.QuestionService;
import com.example.onlinelearning.service.QuestionSetService;
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
    public ServiceResponse<Boolean> createQuestionSet(@RequestBody QuestionSetCreation questionSetCreation){
        return questionSetService.createQuestionSet(questionSetCreation);
    }
}
