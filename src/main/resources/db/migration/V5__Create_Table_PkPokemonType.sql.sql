CREATE TABLE IF NOT EXISTS `pk_pokemon_type` (
  `id_movement` bigint NOT NULL AUTO_INCREMENT,
  `id_type` bigint DEFAULT NULL,
  `pokemon_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id_movement`)
);