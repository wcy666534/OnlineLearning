package com.example.onlinelearning.service.serviceImpl;

import com.example.onlinelearning.dao.CreatorMapper;
import com.example.onlinelearning.dao.DisciplineMapper;
import com.example.onlinelearning.dao.KnowledgePointMapper;
import com.example.onlinelearning.dao.PreKnowledgePointToKnowledgeMapper;
import com.example.onlinelearning.domain.KnowledgePoint;
import com.example.onlinelearning.domain.PreKnowledgePointToKnowledge;
import com.example.onlinelearning.domain.QuestionSet;
import com.example.onlinelearning.domain.QuestionSetToQuestion;
import com.example.onlinelearning.models.KnowledgePointCreation;
import com.example.onlinelearning.models.ServiceResponse;
import com.example.onlinelearning.service.KnowledgePointService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

   public ServiceResponse<Boolean> createKnowledgePoint(KnowledgePointCreation knowledgePointCreation){
       log.info("knowledgePointCreation=" + knowledgePointCreation);
       /*  参数检查*/
       //检查creatorId是否存在

       if(creatorMapper.selectByPrimaryKey(knowledgePointCreation.getCreatorId())==null){
           System.err.println("creator is not exist");
           return ServiceResponse.buildErrorResponse(1,"creator is not exist");
       }
       //檢查disciplineId是否存在discipline表里
       if(disciplineMapper.selectByPrimaryKey(knowledgePointCreation.getDisciplineId()).equals(null)){
           System.err.println("disciplineId is not exist");
           return ServiceResponse.buildErrorResponse(1,"disciplineId is not exist");
       }
       //检查preKnowledgePoint是否存在
       Long preKnowledgePointId[]=knowledgePointCreation.getPreKnowledgePoint();
       Boolean flag =true;
       for (int i = 0; i < preKnowledgePointId.length; i++) {
           if(knowledgePointMapper.selectByPrimaryKey(preKnowledgePointId[i])==null){
               flag= false;
           }
       }
       if (flag ==false) {
           System.err.println("preKnowledgePointId is not exist");
           return ServiceResponse.buildErrorResponse(1,"preKnowledgePointId is not exist");
       }
       try {
           KnowledgePoint knowledgePoint= new KnowledgePoint(knowledgePointCreation.getId(), knowledgePointCreation.getDisciplineId(),knowledgePointCreation.getName(), knowledgePointCreation.getDescriptionUrl(), knowledgePointCreation.getCreatorId());
           int insertSuccessCount =knowledgePointMapper.insert(knowledgePoint);
           for (int i = 0; i < preKnowledgePointId.length; i++) {
               PreKnowledgePointToKnowledge preKnowledgePointToKnowledge= new PreKnowledgePointToKnowledge(knowledgePointCreation.getId(),preKnowledgePointId[i]);
               preKnowledgePointToKnowledgeMapper.insert(preKnowledgePointToKnowledge);
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
