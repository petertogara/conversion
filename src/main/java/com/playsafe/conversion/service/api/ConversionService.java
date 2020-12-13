package com.playsafe.conversion.service.api;

public interface ConversionService {

    double kelvinToCelsius(double inputToBeConverted);

    double celsiusToKelvin(double inputToBeConverted);

    double milesToKilometers(double inputToBeConverted);

    double kilometersToMiles(double inputToBeConverted);
}
