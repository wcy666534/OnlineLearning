package com.example.onlineLearning.controller;

import com.example.onlineLearning.domain.LabelToQuestion;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.LabelToQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:17
 * @Description: 致敬
 */
@RestController
@RequestMapping("/label_to_question")
public class LabelToQuestionController {
    @Autowired
    private LabelToQuestionService LabelToQuestionService;

    @RequestMapping("/create")
    public ServiceResponse<Boolean> createLabelToQuestion(@RequestBody LabelToQuestion labelToQuestion) {
        return LabelToQuestionService.createLabelToQuestion(labelToQuestion);
    }
}
