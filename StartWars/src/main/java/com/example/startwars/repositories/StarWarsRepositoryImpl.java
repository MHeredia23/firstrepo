package com.example.startwars.repositories;

import com.example.startwars.dtos.StarWarsCharacterDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StarWarsRepositoryImpl implements StarWarsRepository{

    private final String URL_FILE = "classpath:static/starwars.json";

    @Override
    public List<StarWarsCharacterDTO> findLikeName(String name) {
        List<StarWarsCharacterDTO> starWarsCharacterDTOS = loadDataBase();
        return starWarsCharacterDTOS.stream()
                .filter(character-> character.getName().contains(name))
                .collect(Collectors.toList());

    }

    private List<StarWarsCharacterDTO> loadDataBase() {
        try {
            File file = ResourceUtils.getFile(URL_FILE);
            return mapToStarWarsDto(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<StarWarsCharacterDTO> mapToStarWarsDto(File file) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(file, new TypeReference<>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
