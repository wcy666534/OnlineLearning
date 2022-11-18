package com.example.onlinelearning.dao;

import com.example.onlinelearning.domain.Teacher;
import java.util.List;

public interface TeacherMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Teacher row);

    Teacher selectByPrimaryKey(Long id);

    List<Teacher> selectAll();

    int updateByPrimaryKey(Teacher row);
}