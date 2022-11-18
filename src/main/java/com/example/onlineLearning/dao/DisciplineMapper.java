package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Discipline;
import java.util.List;

public interface DisciplineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Discipline row);

    Discipline selectByPrimaryKey(Long id);

    List<Discipline> selectAll();

    int updateByPrimaryKey(Discipline row);
}