package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.LabelToQuestion;
import java.util.List;

public interface LabelToQuestionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LabelToQuestion row);

    LabelToQuestion selectByPrimaryKey(Long id);

    List<LabelToQuestion> selectAll();

    int updateByPrimaryKey(LabelToQuestion row);
}