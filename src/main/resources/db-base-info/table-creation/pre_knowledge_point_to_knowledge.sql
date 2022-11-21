CREATE TABLE `pre_knowledge_point_to_knowledge`
(
    `id`                     BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `knowledge_point_id`     BIGINT NOT NULL COMMENT 'ID of the knowledge point.',
    `pre_knowledge_point_id` BIGINT NOT NULL COMMENT 'ID of the pre knowledge point.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Record the correspondence between pre knowledge point and  knowledge point.';