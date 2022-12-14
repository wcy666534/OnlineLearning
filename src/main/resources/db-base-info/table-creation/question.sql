CREATE TABLE `question`
(
    `id`                       bigint                                                 NOT NULL AUTO_INCREMENT COMMENT ' Auto increment primary key.',
    `question_body_url`        varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT ' URL of the question body.',
    `answer_body_url`          varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT ' URL of the answer body of the question.',
    `discipline_id`            bigint                                                 NOT NULL COMMENT ' ID of the discipline that the question belongs to.',
    `source_type_id`           int                                                    NOT NULL COMMENT ' Source type of the question, 0 - reprint, 1 - original.',
    `difficulty_type_id`       int                                                    NOT NULL COMMENT ' ID of the difficulty of the question, 0- easy, 1- medium, 2- difficult.',
    `question_type_id`         int                                                    NOT NULL COMMENT ' ID of the question type, 0- fill int the blank, 1- multiple choice, 2- true or false, 3-analysis.',
    `estimated_time_to_finish` int                                                    NOT NULL COMMENT ' Estimated time to finish the question, unit: seconds.',
    `creator_id`               bigint                                                 NOT NULL COMMENT ' ID of the creator.',
    `creation_time`            datetime                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT ' Creation time of the discipline.',
    `update_operator_id`       bigint                                                 NOT NULL COMMENT ' ID of the account of last update.',
    `update_time`              datetime                                               NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT ' Time of last update.',
    PRIMARY KEY (`id`),
    KEY `idx_creator_id` (`creator_id`),
    KEY `idx_discipline_id` (`discipline_id`),
    KEY `idx_difficulty_type_id` (`difficulty_type_id`),
    KEY `idx_question_type_id` (`question_type_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin
  COMMENT ='Information of questions.';