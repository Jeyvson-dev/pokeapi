package com.br.erudio.pokeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.erudio.pokeapi.model.PkPokemonType;

public interface PkPokemonTypeRepository extends JpaRepository<PkPokemonType, Long>{
    List<PkPokemonType> findAllByPokemonId(Long id); 
}
