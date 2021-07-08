package com.example.linktracker.services;

import com.example.linktracker.dtos.UrlDTO;
import com.example.linktracker.dtos.request.UrlRequestDTO;
import com.example.linktracker.dtos.response.UrlResponseDTO;
import com.example.linktracker.exceptions.NotFoundUrl;
import com.example.linktracker.exceptions.PasswordNecesary;
import com.example.linktracker.repositories.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UrlServiceImpl implements UrlService{

    private final UrlRepository urlRepository;

    public UrlServiceImpl(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    @Override
    public UrlResponseDTO saveUrl(UrlRequestDTO urlRequestDTO) {
        UrlDTO urlDTO = urlRepository.saveUrl(urlRequestDTO);
        return new UrlResponseDTO(urlDTO.getLinkId(), urlDTO.getRedirect());
    }

    @Override
    public String redirectUrl(Integer linkId, String password) throws NotFoundUrl, PasswordNecesary {
        UrlDTO urlDTO = urlRepository.findByUrl(linkId);
        if(Objects.nonNull(urlDTO.getPassword())){
            if(!urlDTO.getPassword().equals(password)){
                throw new PasswordNecesary();
            }
        }
        Integer metric = urlDTO.getMetric();
        urlDTO.setMetric(++metric);
        return urlDTO.getUrl();
    }

    @Override
    public String invalidateUrl(Integer linkId) throws NotFoundUrl {
        UrlDTO urlDTO = urlRepository.updateUrl(linkId);
        return urlDTO.getLinkId() + " cambio su estado a invalid";
    }

    @Override
    public String metric(Integer linkId) throws NotFoundUrl {
        UrlDTO urlDTO = urlRepository.findByUrl(linkId);
        return "La web "+urlDTO.getWeb()+" fue visitada "+urlDTO.getMetric();
    }
}
