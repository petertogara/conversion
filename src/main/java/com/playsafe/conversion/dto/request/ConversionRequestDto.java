package com.playsafe.conversion.dto.request;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;


@Data
public class ConversionRequestDto {

    @NotNull(message = "Input to be converted is requiured")
    @Digits(integer = 16, fraction = 2)
    private double inputToBeConverted;

}
