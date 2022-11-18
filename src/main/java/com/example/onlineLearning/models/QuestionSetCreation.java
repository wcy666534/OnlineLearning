package com.example.onlineLearning.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/11/11/9:58
 * @Description: 致敬
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionSetCreation {
    private Long id;
    private Long questionId[];
    private String name;
    private String description;
    private Long disciplineId;
    private Long creatorId;
}
