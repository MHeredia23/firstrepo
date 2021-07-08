package com.example.linktracker.controllers;

import com.example.linktracker.dtos.request.UrlRequestDTO;
import com.example.linktracker.dtos.response.UrlResponseDTO;
import com.example.linktracker.exceptions.NotFoundUrl;
import com.example.linktracker.exceptions.PasswordNecesary;
import com.example.linktracker.services.UrlService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/save")
    public ResponseEntity<UrlResponseDTO> saveUrl(@Valid @RequestBody UrlRequestDTO urlRequestDTO) {
        return new ResponseEntity<>(urlService.saveUrl(urlRequestDTO), HttpStatus.OK);
    }

    @GetMapping("/link/{linkId}")
    public ResponseEntity<Void> redirect(@PathVariable Integer linkId,
                                         @RequestParam(required = false) String password)
            throws NotFoundUrl, PasswordNecesary {
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(urlService.redirectUrl(linkId, password)))
                .build();
    }

    @PostMapping("/invalidate/{linkId}")
    public ResponseEntity<String> validate(@PathVariable Integer linkId) throws NotFoundUrl {
        return new ResponseEntity<>(urlService.invalidateUrl(linkId), HttpStatus.OK);
    }

    @GetMapping("/metrics/{linkId}")
    public ResponseEntity<String> metric(@PathVariable Integer linkId) throws NotFoundUrl {
        return new ResponseEntity<>(urlService.metric(linkId), HttpStatus.OK);
    }


}
