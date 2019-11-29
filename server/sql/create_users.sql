CREATE TABLE IF NOT EXISTS `users` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(256) NOT NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT current_timestamp,
  PRIMARY KEY (`id`));

INSERT INTO users (name) VALUES ('e1'), ('e2'), ('e3');

