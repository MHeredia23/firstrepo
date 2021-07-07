package com.example.startwars.services;

import com.example.startwars.dtos.StarWarsCharacterDTO;
import com.example.startwars.repositories.StarWarsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StarWarsServiceImpl implements StarWarsServices{

    private final StarWarsRepository starWarsRepository;


    @Override
    public List<String> getNameStarWars(String name) {
        List<StarWarsCharacterDTO> characterDTOS = starWarsRepository.findLikeName(name);
        List<String> similar = new ArrayList<>();
        characterDTOS.forEach(character-> similar.add(character.getName()));
        return similar;
    }

}
