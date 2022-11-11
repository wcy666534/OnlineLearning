package com.example.onlinelearning.domain;

public class PreKnowledgePointToKnowledge {
    private Long id;

    private Long knowledgePointId;

    private Long preKnowledgePointId;

    public PreKnowledgePointToKnowledge(Long knowledgePointId, Long preKnowledgePointId) {
        this.knowledgePointId = knowledgePointId;
        this.preKnowledgePointId = preKnowledgePointId;
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

    public Long getPreKnowledgePointId() {
        return preKnowledgePointId;
    }

    public void setPreKnowledgePointId(Long preKnowledgePointId) {
        this.preKnowledgePointId = preKnowledgePointId;
    }
}