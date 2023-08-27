##Modo de Uso##

Basta iniciar o Tomcat e a API irá criar em sua máquina todas às tabelas do banco de dados setado como "pokeapi" (Caso deseje alterar user, password e nome do banco mudar em "application.yml")

feito isso às migrations irão popular a base com os pokémons, e às tabelas de reclacionamento e tipos

O resultado da API irá trazer um json com

{
    "pokemonId": ,
    "pokemonName": "",
    "hp": ,
    "atack": ,
    "defense": ,
    "specialAtack": ,
    "specialDefense": ,
    "speed": ,
    "types": [
        {
            "type": ""
        },
        {
            "type": ""
        }
    ]
}
