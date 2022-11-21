package com.example.onlineLearning.service.impl;

import com.example.onlineLearning.dao.CreatorMapper;
import com.example.onlineLearning.dao.DisciplineMapper;
import com.example.onlineLearning.dao.KnowledgePointMapper;
import com.example.onlineLearning.dao.PreKnowledgePointToKnowledgeMapper;
import com.example.onlineLearning.domain.KnowledgePoint;
import com.example.onlineLearning.domain.PreKnowledgePointToKnowledge;
import com.example.onlineLearning.models.KnowledgePointCreation;
import com.example.onlineLearning.models.ServiceResponse;
import com.example.onlineLearning.service.KnowledgePointService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 作者
 * @Date: 2022/11/11/14:14
 * @Description: 致敬
 */
@Service
@Slf4j
public class KnowledgePointServiceImpl implements KnowledgePointService {
    @Autowired
    private KnowledgePointMapper knowledgePointMapper;
    @Autowired
    private PreKnowledgePointToKnowledgeMapper preKnowledgePointToKnowledgeMapper;
    @Autowired
    private DisciplineMapper disciplineMapper;
    @Autowired
    private CreatorMapper creatorMapper;

    public ServiceResponse<Boolean> createKnowledgePoint(KnowledgePointCreation knowledgePointCreation) {
        log.info("knowledgePointCreation=" + knowledgePointCreation);

        /*  参数检查*/
        //检查creatorId是否存在
        if (creatorMapper.selectByPrimaryKey(knowledgePointCreation.getCreatorId()) == null) {
            System.err.println("creator does not exist");
//            log.error("creator does not exist");
            return ServiceResponse.buildErrorResponse(1, "creator is not exist");
        }

        //檢查disciplineId是否存在discipline表里
        if (disciplineMapper.selectByPrimaryKey(knowledgePointCreation.getDisciplineId()) == null) {
            System.err.println("disciplineId is not exist");
            return ServiceResponse.buildErrorResponse(1, "disciplineId is not exist");
        }

        //检查preKnowledgePoint是否存在
        //region 有问题
        // 1. 有false直接return，不需要在下面重新判断
        // 2. 只需要走1遍数据库
        // 3. 用COUNT而不是selectByPrimaryKey

        // 第1版改动，对应问题1
//        Long[] preKnowledgePointId = knowledgePointCreation.getPreKnowledgePoint();
//        Boolean flag = true;
//        for (int i = 0; i < preKnowledgePointId.length; i++) {
//            if (knowledgePointMapper.selectByPrimaryKey(preKnowledgePointId[i]) == null) {
//                System.err.println("preKnowledgePointId is not exist");
//                return ServiceResponse.buildErrorResponse(1, "preKnowledgePointId is not exist");
//            }
//        }

        // 第2版改动，对应问题2
//        Long[] preKnowledgePointId = knowledgePointCreation.getPreKnowledgePoint();
//        Boolean flag = true;
//        List<KnowledgePoint> knowledgePoints = knowledgePointMapper.selectByPrimaryKeys(Arrays.asList(preKnowledgePointId));
//        for (KnowledgePoint knowledgePoint : knowledgePoints) {
//            if (knowledgePoint == null) {
//                System.err.println("preKnowledgePointId is not exist");
//                return ServiceResponse.buildErrorResponse(1, "preKnowledgePointId is not exist");
//            }
//        }

        // 第3版改动，对应问题3
        Long[] preKnowledgePointId = knowledgePointCreation.getPreKnowledgePoint();
        int knowledgePointCount = knowledgePointMapper.countByPrimaryKeys(Arrays.asList(preKnowledgePointId));
        if (knowledgePointCount != preKnowledgePointId.length) {
            System.err.println("preKnowledgePointId is not exist");
            return ServiceResponse.buildErrorResponse(1, "preKnowledgePointId is not exist");
        }
        //endregion

        try {
            KnowledgePoint knowledgePoint = new KnowledgePoint(knowledgePointCreation.getId(), knowledgePointCreation.getDisciplineId(), knowledgePointCreation.getName(), knowledgePointCreation.getDescriptionUrl(), knowledgePointCreation.getCreatorId());
            int insertSuccessCount = knowledgePointMapper.insert(knowledgePoint);
            for (int i = 0; i < preKnowledgePointId.length; i++) {
                PreKnowledgePointToKnowledge preKnowledgePointToKnowledge = new PreKnowledgePointToKnowledge(knowledgePointCreation.getId(), preKnowledgePointId[i]);
                preKnowledgePointToKnowledgeMapper.insert(preKnowledgePointToKnowledge);
                // 用<foreach>
            }
            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when insert knowledge point");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when insert knowledge point");
        }
    }
}
