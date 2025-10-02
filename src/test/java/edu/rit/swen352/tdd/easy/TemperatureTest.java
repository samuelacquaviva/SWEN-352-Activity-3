package edu.rit.swen352.tdd.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edu.rit.swen352.tdd.easy.Temperature.TemperatureUnit;

import static org.junit.jupiter.api.Assertions.*;

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
    @DisplayName("Create Temperature object with unit below absolute zero")
    public void testConstructor3(){
        Temperature temperature = new Temperature(-.1, TemperatureUnit.KELVIN);
        assertTrue(temperature instanceof Temperature);
    }
}
