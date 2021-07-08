package com.example.linktracker.services;

import com.example.linktracker.dtos.request.UrlRequestDTO;
import com.example.linktracker.dtos.response.UrlResponseDTO;
import com.example.linktracker.exceptions.NotFoundUrl;
import com.example.linktracker.exceptions.PasswordNecesary;

public interface UrlService {

    UrlResponseDTO saveUrl(UrlRequestDTO urlRequestDTO);
    String redirectUrl(Integer linkId, String password) throws NotFoundUrl, PasswordNecesary;
    String invalidateUrl(Integer linkId) throws NotFoundUrl;
    String metric(Integer linkId) throws NotFoundUrl;

}
