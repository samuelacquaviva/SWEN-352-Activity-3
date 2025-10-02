package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.rit.swen352.tdd.easy.Temperature.TemperatureUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

/**
 * Test suite for the {@link Temperature} component.
 */
class TemperatureTest {
    @Test
    @DisplayName("Create basic Temperature object")
    public void testConstructor1(){
        Temperature temperature = new Temperature(0.0, TemperatureUnit.FAHRENHEIT);
        assertTrue(temperature instanceof Temperature);
    }

    @Test
    @DisplayName("Create Temperature object without unit")
    public void testConstructor2(){
        Temperature temperature = new Temperature(0.0);
        assertTrue(temperature instanceof Temperature);
    }

    @Test
    @DisplayName("Try to create Temperature object with unit below absolute zero")
    public void testConstructor3(){
        Temperature temperature = null;
        try{
            temperature = new Temperature(-.1, TemperatureUnit.KELVIN);
        }catch(IllegalArgumentException e){
            assertFalse(temperature instanceof Temperature);
        }

        temperature = null;
        try{
            temperature = new Temperature(-273.16, TemperatureUnit.CELSIUS);
        }catch(IllegalArgumentException e){
            assertFalse(temperature instanceof Temperature);
        }

        temperature = null;
        try{
            temperature = new Temperature(-459.67, TemperatureUnit.FAHRENHEIT);
        }catch(IllegalArgumentException e){
            assertFalse(temperature instanceof Temperature);
        }

        temperature = null;
        try{
            temperature = new Temperature(-273.16);
        }catch(IllegalArgumentException e){
            assertFalse(temperature instanceof Temperature);
        }
    }

    @Test
    @DisplayName("Test conversions between Temperatures")
    public void testConversion1(){
        Temperature temperature = new Temperature(0);
        Temperature newTemperature = temperature.convert(TemperatureUnit.FAHRENHEIT);
        assertTrue(newTemperature.getUnit() == TemperatureUnit.FAHRENHEIT && newTemperature.getValue() == 32);
    }
}
