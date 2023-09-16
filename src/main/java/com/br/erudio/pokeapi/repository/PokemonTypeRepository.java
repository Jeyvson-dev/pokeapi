package com.br.erudio.pokeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.br.erudio.pokeapi.model.PokemonType;
import com.br.erudio.pokeapi.projection.PokemonTypeProjection;

public interface PokemonTypeRepository extends JpaRepository<PokemonType, Long>{

    PokemonTypeProjection findByIdType(Long id);
}
