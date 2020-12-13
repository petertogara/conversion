package com.playsafe.conversion.service.api;

public interface ConversionService {

    double convertKelvinToCelsius(double inputToBeConverted);

    double convertCelsiusToKelvin(double inputToBeConverted);

    double convertMilesToKilometers(double inputToBeConverted);

    double convertKilometersToMiles(double inputToBeConverted);
}
