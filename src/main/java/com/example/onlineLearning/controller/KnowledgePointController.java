package com.example.onlineLearning.controller;

import com.example.onlineLearning.models.KnowledgePointCreation;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.KnowledgePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/11/14:11
 * @Description: 致敬
 */
@RestController
@RequestMapping("/knowledge_point")
public class KnowledgePointController {
    @Autowired
    private KnowledgePointService knowledgePointService;

    @RequestMapping("/create")
    public ServiceResponse<Boolean> createQuestionSet(@RequestBody KnowledgePointCreation knowledgePointCreation) {
        return knowledgePointService.createKnowledgePoint(knowledgePointCreation);
    }
}
