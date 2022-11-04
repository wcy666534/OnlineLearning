CREATE TABLE `question_base_info`
(
    `id` BIGINT AUTO_INCREMENT COMMENT 'ID.',
    `question` VARCHAR(200)   COMMENT 'question.',
    `answer` VARCHAR(200)   COMMENT 'analyse.',
    `founder` BIGINT  COMMENT 'founder.',
    `subject` VARCHAR(200)  COMMENT 'subject.',
    `source` VARCHAR(200)  COMMENT 'source.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';