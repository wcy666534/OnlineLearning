package com.example.onlineLearning.controller;

import com.example.onlineLearning.domain.Label;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:03
 * @Description: 致敬
 */
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    private LabelService labelService;

    @RequestMapping("/create")
    public ServiceResponse<Boolean> createLabel(@RequestBody Label label) {
        return labelService.createLabel(label);
    }
}
