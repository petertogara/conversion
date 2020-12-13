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
    public double kelvinToCelsius(@Valid @RequestBody ConversionRequestDto conversionRequestDto){
        return conversionService.kelvinToCelsius(conversionRequestDto.getInputToBeConverted());
    }


    @PostMapping("/ctok")
    public double celsiusToKelvin(@Valid @RequestBody ConversionRequestDto conversionRequestDto){
        return conversionService.celsiusToKelvin(conversionRequestDto.getInputToBeConverted());
    }

    @PostMapping("/mtok")
    public double milesToKilometers(@Valid @RequestBody ConversionRequestDto conversionRequestDto){
        return conversionService.milesToKilometers(conversionRequestDto.getInputToBeConverted());
    }


    @PostMapping("/ktom")
    public double kilometersToMiles(@Valid @RequestBody ConversionRequestDto conversionRequestDto){
        return conversionService.kilometersToMiles(conversionRequestDto.getInputToBeConverted());
    }

}
