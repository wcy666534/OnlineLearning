package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.LabelToKnowledge;
import java.util.List;

public interface LabelToKnowledgeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LabelToKnowledge row);

    LabelToKnowledge selectByPrimaryKey(Long id);

    List<LabelToKnowledge> selectAll();

    int updateByPrimaryKey(LabelToKnowledge row);
}