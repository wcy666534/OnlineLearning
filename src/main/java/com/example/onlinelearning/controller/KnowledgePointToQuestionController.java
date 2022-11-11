package com.example.onlinelearning.controller;

import com.example.onlinelearning.domain.KnowledgePointToQuestion;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.KnowledgePointToQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/11/15:24
 * @Description: 致敬
 */
@RestController
@RequestMapping("/knowledge_point_to_question")
public class KnowledgePointToQuestionController {
    @Autowired
    private KnowledgePointToQuestionService knowledgePointToQuestionService;

    @RequestMapping("/create")
    public ServiceResponse<Boolean> createKnowledgePointToQuestion(@RequestBody KnowledgePointToQuestion knowledgePointToQuestion) {
        return knowledgePointToQuestionService.createKnowledgePointToQuestion(knowledgePointToQuestion);
    }
}
