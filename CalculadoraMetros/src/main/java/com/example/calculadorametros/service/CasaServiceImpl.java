package com.example.calculadorametros.service;

import com.example.calculadorametros.dto.request.CasaRequestDto;
import com.example.calculadorametros.dto.request.HabitacionRequestDto;
import com.example.calculadorametros.dto.response.CasaResponseDto;
import com.example.calculadorametros.dto.response.HabitacionResponseDto;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CasaServiceImpl implements CasaService{

    private final Double VALOR_METRO_CUADRADO = 800.0;

    @Override
    public CasaResponseDto calculateHouse(CasaRequestDto casa) {
        CasaResponseDto casaResponseDto = new CasaResponseDto();
        Map<String, Double> metrosPorHabitacion = new HashMap<>();
        casa.getHabitacionRequestDtos().forEach(hb-> metrosPorHabitacion.put(hb.getNombre(), hb.getAncho()*hb.getLargo()));
        casaResponseDto.setMetrosCuadradosPorHabitacion(metrosPorHabitacion);
        casaResponseDto.setMetrosCuadradosTotales(casa.getHabitacionRequestDtos().stream().mapToDouble(hb-> hb.getAncho()* hb.getLargo()).sum());
        casaResponseDto.setHabitacionMasGrande(new HabitacionResponseDto(this.getHabitacionMasGrande(casa.getHabitacionRequestDtos())));
        casaResponseDto.setValor(casaResponseDto.getMetrosCuadradosTotales()*VALOR_METRO_CUADRADO);
        return casaResponseDto;
    }

    private HabitacionRequestDto getHabitacionMasGrande(List<HabitacionRequestDto> habitacionRequestDtos) {
        HabitacionRequestDto habitacionMasGrande = habitacionRequestDtos.get(0);
        Double masGrande = habitacionMasGrande.getAncho()*habitacionMasGrande.getLargo();
        for(HabitacionRequestDto hb: habitacionRequestDtos){
            Double temp = hb.getAncho()* hb.getLargo();
            if(temp>masGrande){
                masGrande = temp;
                habitacionMasGrande = hb;
            }
        }
        return habitacionMasGrande;
    }
}
