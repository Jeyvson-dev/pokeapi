package com.br.erudio.pokeapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.erudio.pokeapi.exceptions.PokemonNotFoundException;
import com.br.erudio.pokeapi.model.PkPokemonType;
import com.br.erudio.pokeapi.model.Pokemon;
import com.br.erudio.pokeapi.model.PokemonType;
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
    PkPokemonTypeRepository pkPokemonTypeRepository;

    public Pokemon getPokemonById(Long id){

        List<PokemonTypeProjection> pokemontype = new ArrayList<>();

        Pokemon pokemon = pokemonrepository.findById(id)
                            .orElseThrow(() -> new PokemonNotFoundException(id));
                            
        List<PkPokemonType> pokemon_pokemontpye = pkPokemonTypeRepository.findAllByPokemonId(id);    

        for (PkPokemonType pkPokemonType : pokemon_pokemontpye) {

            pokemontype.add(pokemontyperepository.findByIdType(pkPokemonType.getIdType()));
        }
 
        pokemon.setTypes(pokemontype);

        return pokemon;
                                            
    }
}
