package com.playsafe.conversion;

import com.playsafe.conversion.service.impl.ConversionServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class ConversionServiceImplTest {

    @InjectMocks
    private ConversionServiceImpl conversionServiceImpl;

    @Test
    public void convertKelvinToCelsiusTest() {
        double inputToBeConverted = 309.15;
        double celcius = conversionServiceImpl.convertKelvinToCelsius(inputToBeConverted);
        assertEquals(36, celcius,0);
    }

    @Test
    public void convertCelsiusToKelvinTest() {
        double inputToBeConverted = 10.0;
        double kelvin = conversionServiceImpl.convertCelsiusToKelvin(inputToBeConverted);
        assertEquals(283.15, kelvin,0);
    }

    @Test
    public void convertMilesToKilometersTest() {
        double inputToBeConverted = 15.0;
        double km = conversionServiceImpl.convertMilesToKilometers(inputToBeConverted);
        assertEquals(24.14016, km,0);
    }

    @Test
    public void convertKilometersToMilesTest() {
        double inputToBeConverted = 10.0;
        double miles = conversionServiceImpl.convertKilometersToMiles(inputToBeConverted);
        assertEquals(6.21371, miles,0.1);
    }

}
