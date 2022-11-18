package com.example.onlineLearning.dao;

import com.example.onlineLearning.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student row);

    Student selectByPrimaryKey(Long id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student row);
    Integer insertStudentData(List<Student> studentList);
}