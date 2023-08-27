package com.br.erudio.pokeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.erudio.pokeapi.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{}
