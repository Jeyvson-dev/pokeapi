package com.br.erudio.pokeapi.model;

import java.util.Objects;

import javax.persistence.JoinColumn;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "types")
public class PokemonType {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;

    @Column(name = "type_name", length = 50)
    private String type;

    @ManyToOne
    @JoinColumn(name = "pokemon_id")
    private Pokemon pokemon;


    public PokemonType() {
    }

    public Long getIdType() {
        return this.idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Pokemon getPokemon(){

        return this.pokemon;
    }

    public void setPokemon(Pokemon pokemon){

        this.pokemon = pokemon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PokemonType that = (PokemonType) o;
        return Objects.equals(idType, that.idType) &&
               Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idType, type);
    }

}
