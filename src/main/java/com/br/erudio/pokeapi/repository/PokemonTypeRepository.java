package com.br.erudio.pokeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.erudio.pokeapi.model.PokemonType;
import com.br.erudio.pokeapi.projection.PokemonTypeProjection;

public interface PokemonTypeRepository extends JpaRepository<PokemonType, Long>{
    PokemonTypeProjection findByIdType(Long id);
}
