package com.playsafe.conversion.controller;

import com.playsafe.conversion.dto.request.ConversionRequestDto;
import com.playsafe.conversion.service.api.ConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/conversions")
public class ConversionController {

    @Autowired
    private ConversionService conversionService;

    @PostMapping("/ktoc")
    public double convertKelvinToCelsius(@Valid @RequestBody ConversionRequestDto conversionRequestDto) {
        return conversionService.convertKelvinToCelsius(conversionRequestDto.getInputToBeConverted());
    }


    @PostMapping("/ctok")
    public double convertCelsiusToKelvin(@Valid @RequestBody ConversionRequestDto conversionRequestDto) {
        return conversionService.convertCelsiusToKelvin(conversionRequestDto.getInputToBeConverted());
    }

    @PostMapping("/mtok")
    public double convertMilesToKilometers(@Valid @RequestBody ConversionRequestDto conversionRequestDto) {
        return conversionService.convertMilesToKilometers(conversionRequestDto.getInputToBeConverted());
    }


    @PostMapping("/ktom")
    public double convertKilometersToMiles(@Valid @RequestBody ConversionRequestDto conversionRequestDto) {
        return conversionService.convertKilometersToMiles(conversionRequestDto.getInputToBeConverted());
    }

}
