package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.Discipline;
import java.util.List;

public interface DisciplineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Discipline row);

    Discipline selectByPrimaryKey(Long id);

    List<Discipline> selectAll();

    int updateByPrimaryKey(Discipline row);
}