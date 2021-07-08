package com.example.linktracker.repositories;

import com.example.linktracker.dtos.UrlDTO;
import com.example.linktracker.dtos.request.UrlRequestDTO;
import com.example.linktracker.exceptions.NotFoundUrl;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
public class UrlRepositoryImpl implements UrlRepository{

    private int lastIndex;
    private List<UrlDTO> urlDTOList;
    private final String BASE_URL = "http://localhost:8080/link/";

    public UrlRepositoryImpl() {
        this.lastIndex = 0;
        this.urlDTOList = new ArrayList<>();
    }

    @Override
    public UrlDTO saveUrl(UrlRequestDTO urlRequestDTO) {
        UrlDTO urlDTO = new UrlDTO(++lastIndex,BASE_URL+lastIndex,urlRequestDTO.getWeb(),urlRequestDTO.getUrl());
        if(Objects.nonNull(urlRequestDTO.getPassword())) urlDTO.setPassword(urlRequestDTO.getPassword());
        urlDTOList.add(urlDTO);
        return urlDTO;
    }

    @Override
    public UrlDTO findByUrl(Integer linkId) throws NotFoundUrl {
        UrlDTO dto =  getById(linkId);
        return dto;
    }

    @Override
    public UrlDTO updateUrl(Integer linkId) throws NotFoundUrl {
        UrlDTO dto = getById(linkId);
        dto.setValid(false);
        return dto;
    }

    private UrlDTO getById(Integer id) throws NotFoundUrl {
        Optional<UrlDTO> dto = urlDTOList.stream().filter(url-> url.getLinkId() == id &&
                url.isValid()).findFirst();
        if(dto.isPresent()) return dto.get();
        throw new NotFoundUrl();
    }

}
