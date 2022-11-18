package com.example.onlineLearning.service.serviceImpl;

import com.example.onlineLearning.dao.KnowledgePointMapper;
import com.example.onlineLearning.dao.LabelMapper;
import com.example.onlineLearning.dao.LabelToKnowledgeMapper;
import com.example.onlineLearning.domain.LabelToKnowledge;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.LabelToKnowledgeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:21
 * @Description: 致敬
 */
@Service
@Slf4j
public class LabelToKnowledgeServiceImpl implements LabelToKnowledgeService {
    @Autowired
    private LabelToKnowledgeMapper labelToKnowledgeMapper;
    @Autowired
    private LabelMapper labelMapper;
    @Autowired
    private KnowledgePointMapper knowledgePointMapper;

    public ServiceResponse<Boolean> createLabelToKnowledge(LabelToKnowledge labelToKnowledge) {
        log.info("labelToKnowledge=" + labelToKnowledge);
        /*参数检查*/
        //检查labelId是否存在
        if (knowledgePointMapper.selectByPrimaryKey(labelToKnowledge.getLabelId()) == null) {
            System.err.println("labelId is not exist");
            return ServiceResponse.buildErrorResponse(1, "labelId is not exist");
        }
        //檢查knowledgePointId是否存在
        if (knowledgePointMapper.selectByPrimaryKey(labelToKnowledge.getKnowledgePointId()) == null) {
            System.err.println("knowledgePointId is not exist");
            return ServiceResponse.buildErrorResponse(1, "knowledgePointId is not exist");
        }
        try {
            int insertSuccessCount = labelToKnowledgeMapper.insert(labelToKnowledge);
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert labelToKnowledge");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when insert labelToKnowledge");
        }
    }

}
