package com.br.erudio.pokeapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.erudio.pokeapi.model.PkPokemonType;
import com.br.erudio.pokeapi.model.Pokemon;
import com.br.erudio.pokeapi.projection.PokemonTypeProjection;
import com.br.erudio.pokeapi.repository.PkPokemonTypeRepository;
import com.br.erudio.pokeapi.repository.PokemonRepository;
import com.br.erudio.pokeapi.repository.PokemonTypeRepository;

@Service
public class PokemonService {

    @Autowired
    PokemonRepository pokemonrepository;

    @Autowired
    PokemonTypeRepository pokemontyperepository;

    @Autowired
    PkPokemonTypeRepository pkpokemontyperepository;


    public Pokemon getPokemonById(Long id){
 
        List<PokemonTypeProjection> pokemonType = new ArrayList<>();

        List<PkPokemonType> pokemon_pokemontpye = pkpokemontyperepository.findAllByPokemonId(id);

        Pokemon pokemon = pokemonrepository.findById(id).orElseThrow(() -> new RuntimeException("Pokemon not found with ID: " + id));

        for (PkPokemonType pkPokemonType : pokemon_pokemontpye) {

            pokemonType.add(pokemontyperepository.findByIdType(pkPokemonType.getIdType()));
        }

        
        pokemon.setTypes(pokemonType);
    
        return pokemon;
                                    
    }
}
