package com.example.onlineLearning.domain;

public class QuestionSetToQuestion {
    private Long id;

    private Long questionSetId;

    private Long questionId;

    public QuestionSetToQuestion(Long questionSetId, Long questionId) {
        this.questionSetId = questionSetId;
        this.questionId = questionId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getQuestionSetId() {
        return questionSetId;
    }

    public void setQuestionSetId(Long questionSetId) {
        this.questionSetId = questionSetId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }
}