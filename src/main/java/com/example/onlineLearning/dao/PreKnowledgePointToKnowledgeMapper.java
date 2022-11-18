package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.PreKnowledgePointToKnowledge;
import java.util.List;

public interface PreKnowledgePointToKnowledgeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PreKnowledgePointToKnowledge row);

    PreKnowledgePointToKnowledge selectByPrimaryKey(Long id);

    List<PreKnowledgePointToKnowledge> selectAll();

    int updateByPrimaryKey(PreKnowledgePointToKnowledge row);
}