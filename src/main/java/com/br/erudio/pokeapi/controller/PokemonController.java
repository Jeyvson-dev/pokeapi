package com.br.erudio.pokeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.erudio.pokeapi.model.Pokemon;
import com.br.erudio.pokeapi.service.PokemonService;

@RestController
@RequestMapping("/pokeapi")
public class PokemonController {

    @Autowired
    PokemonService pokemonservice;
  
    @GetMapping(value = "/{id}", produces = "application/json")
    public Pokemon getPokemonById(
        @PathVariable(value = "id")Long id){

        return pokemonservice.getPokemonById(id);
    }
}
