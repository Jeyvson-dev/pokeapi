package com.br.erudio.pokeapi.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "pk_pokemon_type")
public class PkPokemonType {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovement;

    @Column(name = "pokemon_id")
    private Long pokemonId;
    
    @Column(name = "id_type")
    private Long idType;

    public PkPokemonType() {
    }

    public Long getIdMovement() {
        return this.idMovement;
    }

    public void setIdMovement(Long idMovement) {
        this.idMovement = idMovement;
    }
    public void setPokemonId(Long pokemonId) {
        this.pokemonId = pokemonId;
    }

    public Long getPokemonId() {
        return this.pokemonId;
    }

    public void getPokemonId(Long pokemon_id) {
        this.pokemonId = pokemon_id;
    }

    public Long getIdType() {
        return this.idType;
    }

    public void setIdType(Long id_type) {
        this.idType = id_type;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PkPokemonType that = (PkPokemonType) o;
        return Objects.equals(pokemonId, that.pokemonId) &&
               Objects.equals(idType, that.idType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemonId, idType);
    }
        
}
