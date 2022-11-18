package com.example.onlineLearning.service.serviceImpl;

import com.example.onlineLearning.dao.CreatorMapper;
import com.example.onlineLearning.dao.LabelMapper;
import com.example.onlineLearning.domain.Label;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.LabelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/11/11/16:04
 * @Description: 致敬
 */
@Slf4j
@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    private LabelMapper labelMapper;
    @Autowired
    private CreatorMapper creatorMapper;

    public ServiceResponse<Boolean> createLabel(Label label) {
        log.info("label=" + label);
        /*  参数检查*/
        //检查creatorId是否存在
        if (creatorMapper.selectByPrimaryKey(label.getCreatorId()) == null) {
            System.err.println("creator is not exist");
            return ServiceResponse.buildErrorResponse(1, "creator is not exist");
        }
        try {
            int insertSuccessCount = labelMapper.insert(label);
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert label");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when insert label");
        }
    }
}
