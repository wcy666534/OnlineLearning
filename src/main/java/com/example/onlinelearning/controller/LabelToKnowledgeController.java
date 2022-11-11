package com.example.onlinelearning.controller;

import com.example.onlinelearning.domain.LabelToKnowledge;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.LabelToKnowledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:22
 * @Description: 致敬
 */
@RestController
@RequestMapping("/label_to_knowledge")
public class LabelToKnowledgeController {
    @Autowired
    private LabelToKnowledgeService labelToKnowledgeService;

    @RequestMapping("/create")
    public ServiceResponse<Boolean> createLabelToKnowledge(@RequestBody LabelToKnowledge labelToKnowledge) {
        return labelToKnowledgeService.createLabelToKnowledge(labelToKnowledge);
    }
}
