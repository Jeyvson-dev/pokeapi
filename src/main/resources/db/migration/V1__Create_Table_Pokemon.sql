CREATE TABLE IF NOT EXISTS `pokemon` (
  `pokemon_id` bigint NOT NULL AUTO_INCREMENT,
  `atack` int DEFAULT NULL,
  `defense` int DEFAULT NULL,
  `hp` int DEFAULT NULL,
  `pokemon_name` varchar(50) DEFAULT NULL,
  `special_atack` int DEFAULT NULL,
  `special_defense` int DEFAULT NULL,
  `speed` int DEFAULT NULL,
  PRIMARY KEY (`pokemon_id`)
);