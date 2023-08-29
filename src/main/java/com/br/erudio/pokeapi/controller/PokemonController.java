package com.br.erudio.pokeapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.erudio.pokeapi.exceptions.PokemonNotFoundException;
import com.br.erudio.pokeapi.exceptions.Handler.ErroResponse;
import com.br.erudio.pokeapi.model.Pokemon;
import com.br.erudio.pokeapi.service.PokemonService;

@RestController
@RequestMapping("/pokeapi")
public class PokemonController {

    @Autowired
    PokemonService pokemonservice;
  
    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> getPokemonById(
        @PathVariable(value = "id")Long id){

            try {
                Pokemon pokemon =  pokemonservice.getPokemonById(id);

                return ResponseEntity.ok(pokemon);

            } catch (PokemonNotFoundException ex) {

                ErroResponse erroResponse = new ErroResponse();
                erroResponse.setStatus(HttpStatus.NOT_FOUND.value());
                erroResponse.setMensagem(ex.getMessage());
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroResponse);

            }
        
    }
}
