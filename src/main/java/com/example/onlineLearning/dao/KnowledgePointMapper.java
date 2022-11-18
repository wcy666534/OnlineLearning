package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.KnowledgePoint;
import java.util.List;

public interface KnowledgePointMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgePoint row);

    KnowledgePoint selectByPrimaryKey(Long id);

    List<KnowledgePoint> selectAll();

    int updateByPrimaryKey(KnowledgePoint row);
}