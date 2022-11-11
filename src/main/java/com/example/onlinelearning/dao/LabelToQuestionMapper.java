package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.LabelToQuestion;
import java.util.List;

public interface LabelToQuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LabelToQuestion row);

    LabelToQuestion selectByPrimaryKey(Long id);

    List<LabelToQuestion> selectAll();

    int updateByPrimaryKey(LabelToQuestion row);
}