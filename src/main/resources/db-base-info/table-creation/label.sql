CREATE TABLE `label`
(
    `id`                 BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `name`               VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the knowledge point.',
    `creator_id`         BIGINT                                         NOT NULL COMMENT 'ID of the creator.',
    `creation_time`      DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_operator_id` BIGINT                                         NOT NULL COMMENT 'ID of the account of last update.',
    `update_time`        DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of label.';