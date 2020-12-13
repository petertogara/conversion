package com.playsafe.conversion.dto.request;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@NotNull(message = "Input to be converted is requiured")
public class ConversionRequestDto {


    @Digits(integer = 16, fraction = 2)
    private double inputToBeConverted;

    public double getInputToBeConverted() {
        return inputToBeConverted;
    }

    public void setInputToBeConverted(double inputToBeConverted) {
        this.inputToBeConverted = inputToBeConverted;
    }
}
