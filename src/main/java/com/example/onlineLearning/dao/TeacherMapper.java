package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Teacher;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Teacher row);

    Teacher selectByPrimaryKey(Long id);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher row);
}