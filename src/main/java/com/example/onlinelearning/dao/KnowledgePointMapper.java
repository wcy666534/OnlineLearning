package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.KnowledgePoint;
import java.util.List;

public interface KnowledgePointMapper {
    int deleteByPrimaryKey(Long id);

    int insert(KnowledgePoint row);

    KnowledgePoint selectByPrimaryKey(Long id);

    List<KnowledgePoint> selectAll();

    int updateByPrimaryKey(KnowledgePoint row);
}