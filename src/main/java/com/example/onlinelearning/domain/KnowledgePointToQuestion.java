package com.example.onlinelearning.domain;

public class KnowledgePointToQuestion {
    private Long id;

    private Long knowledgePointId;

    private Long questionId;

    private Long creatorId;

    public KnowledgePointToQuestion(Long knowledgePointId, Long questionId, Long creatorId) {
        this.knowledgePointId = knowledgePointId;
        this.questionId = questionId;
        this.creatorId = creatorId;
    }

    public KnowledgePointToQuestion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKnowledgePointId() {
        return knowledgePointId;
    }

    public void setKnowledgePointId(Long knowledgePointId) {
        this.knowledgePointId = knowledgePointId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }
}