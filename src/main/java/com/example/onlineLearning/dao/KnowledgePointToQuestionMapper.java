package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.KnowledgePointToQuestion;
import java.util.List;

public interface KnowledgePointToQuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgePointToQuestion row);

    KnowledgePointToQuestion selectByPrimaryKey(Long id);

    List<KnowledgePointToQuestion> selectAll();

    int updateByPrimaryKey(KnowledgePointToQuestion row);
}