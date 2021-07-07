package com.example.startwars.repositories;

import com.example.startwars.dtos.StarWarsCharacterDTO;

import java.util.List;

public interface StarWarsRepository {

    List<StarWarsCharacterDTO> findLikeName(String name);

}
