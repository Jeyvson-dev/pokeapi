package com.br.erudio.pokeapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.util.List;
import java.util.Objects;

import com.br.erudio.pokeapi.projection.PokemonTypeProjection;

@Entity
@Table(name = "pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pokemonId;
    
    @Column(name = "pokemon_name", length = 50)
    private String pokemonName;

    @Column(name = "hp")
    private Integer hp;

    @Column(name = "atack")
    private Integer atack;

    @Column(name = "defense")
    private Integer defense;

    @Column(name = "special_atack")
    private Integer specialAtack;

    @Column(name = "special_defense")
    private Integer specialDefense;

    @Column(name = "speed")
    private Integer speed;

    @Transient
    private List<PokemonTypeProjection> types;    

    public Pokemon() {

    }

    public List<PokemonTypeProjection> getTypes() {
        return this.types;
    }

    public void setTypes(List<PokemonTypeProjection> types) {
        this.types = types;
    }

    public Long getPokemonId() {
        return this.pokemonId;
    }

    public void setPokemonId(Long pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getPokemonName() {
        return this.pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public Integer getHp() {
        return this.hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getAtack() {
        return this.atack;
    }

    public void setAtack(Integer atack) {
        this.atack = atack;
    }

    public Integer getDefense() {
        return this.defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpecialAtack() {
        return this.specialAtack;
    }

    public void setSpecialAtack(Integer specialAtack) {
        this.specialAtack = specialAtack;
    }

    public Integer getSpecialDefense() {
        return this.specialDefense;
    }

    public void setSpecialDefense(Integer specialDefense) {
        this.specialDefense = specialDefense;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(pokemonId, pokemon.pokemonId) &&
                Objects.equals(pokemonName, pokemon.pokemonName) &&
                Objects.equals(hp, pokemon.hp) &&
                Objects.equals(atack, pokemon.atack) &&
                Objects.equals(defense, pokemon.defense) &&
                Objects.equals(specialAtack, pokemon.specialAtack) &&
                Objects.equals(specialDefense, pokemon.specialDefense) &&
                Objects.equals(speed, pokemon.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pokemonId, pokemonName, hp, atack, defense, specialAtack, specialDefense, speed);
    }
}
