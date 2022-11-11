CREATE TABLE `creator`
(
    `id`                               BIGINT AUTO_INCREMENT COMMENT 'Auto increment primary key.',
    `account`                          VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name of the account.',
    `nickname`                         VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Name to display.',
    `avatar_url`                       VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'URL of the avatar.',
    `phone_number`                     VARCHAR(020) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Phone number of the teacher.',
    `email`                            VARCHAR(200) CHARSET utf8mb4 COLLATE  utf8mb4_bin COMMENT 'Email of the teacher.',
    `encrypted_password`               VARCHAR(100) CHARSET utf8mb4 COLLATE  utf8mb4_bin NOT NULL COMMENT 'Encrypted password.',
    `creation_time`                    DATETIME                                       NOT NULL DEFAULT NOW() COMMENT 'Creation time of the discipline.',
    `update_time`                      DATETIME                                       NOT NULL DEFAULT NOW() ON UPDATE NOW() COMMENT 'Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_account` (`account`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE  utf8mb4_bin
    AUTO_INCREMENT = 1
    COMMENT 'Information of creator.';