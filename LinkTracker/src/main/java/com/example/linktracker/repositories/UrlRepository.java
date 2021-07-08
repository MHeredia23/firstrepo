package com.example.linktracker.repositories;

import com.example.linktracker.dtos.UrlDTO;
import com.example.linktracker.dtos.request.UrlRequestDTO;
import com.example.linktracker.exceptions.NotFoundUrl;

public interface UrlRepository {

    UrlDTO saveUrl(UrlRequestDTO urlRequestDTO);
    UrlDTO findByUrl(Integer linkId) throws NotFoundUrl;
    UrlDTO updateUrl(Integer linkId) throws NotFoundUrl;
}
