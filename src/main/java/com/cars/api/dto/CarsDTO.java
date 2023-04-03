package com.cars.api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public record CarsDTO(

        @NotBlank
        String modelo,

        @NotBlank
        String fabricante,

        @Past
        Date dataFabricacao,
        
        @NotNull
        Double valor,

        @NotNull @Size(min = 4, message = "{validation.name.size.too_short}")
        int anoModelo) {

}