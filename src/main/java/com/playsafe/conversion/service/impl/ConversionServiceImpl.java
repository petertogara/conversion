package com.playsafe.conversion.service.impl;

import com.playsafe.conversion.service.api.ConversionService;
import com.playsafe.conversion.utils.ConversionConstants;
import org.springframework.stereotype.Service;

@Service
public class ConversionServiceImpl implements ConversionService {

    @Override
    public double convertKelvinToCelsius(double inputToBeConverted) {
        return inputToBeConverted - ConversionConstants.KELVIN_TO_CELCIOUS_RATE;
    }

    @Override
    public double convertCelsiusToKelvin(double inputToBeConverted) {
        return inputToBeConverted + ConversionConstants.KELVIN_TO_CELCIOUS_RATE;
    }

    @Override
    public double convertMilesToKilometers(double inputToBeConverted) {
        return inputToBeConverted * ConversionConstants.MILE_TO_KILOMETER_RATE;
    }

    @Override
    public double convertKilometersToMiles(double inputToBeConverted) {
        return inputToBeConverted * ConversionConstants.KILOMETER_TO_MILE_RATE;
    }
}
