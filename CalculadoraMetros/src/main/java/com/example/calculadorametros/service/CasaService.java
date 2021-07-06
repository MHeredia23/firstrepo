package com.example.calculadorametros.service;

import com.example.calculadorametros.dto.request.CasaRequestDto;
import com.example.calculadorametros.dto.response.CasaResponseDto;

public interface CasaService {

    CasaResponseDto calculateHouse(CasaRequestDto casa);

}
