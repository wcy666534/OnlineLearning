package com.example.onlinelearning.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/11/03/16:54
 * @Description: 致敬
 */
/*`id` BIGINT AUTO_INCREMENT COMMENT 'ID.',
        `question` VARCHAR(200)   COMMENT 'question.',
        `answer` VARCHAR(200)   COMMENT 'analyse.',
        `founder` BIGINT  COMMENT 'founder.',
        `subject` VARCHAR(200)  COMMENT 'subject.',
        `source` VARCHAR(200)  COMMENT 'source.',*/
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
public class QuestionBaseInfo {
    private long id ;
    private String question;
    private String answer;
    private long founder;
    private String subject;
    private String source;
}
