CREATE TABLE `label_to_knowledge`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `label_id`        BIGINT  NOT NULL COMMENT 'ID of the label.',
    `knowledge_id`        BIGINT  NOT NULL COMMENT 'ID of the knowledge.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Record the correspondence between label and knowledge.';