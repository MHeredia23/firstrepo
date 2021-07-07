package com.example.startwars.controllers;

import com.example.startwars.services.StarWarsServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/star_war")
public class StarWarsController {

    private final StarWarsServices starWarsServices;

    @GetMapping("/similar/{name}")
    public ResponseEntity<List<String>> getSimilarName(@PathVariable String name){
        return new ResponseEntity<>(starWarsServices.getNameStarWars(name), HttpStatus.OK);
    }

}
