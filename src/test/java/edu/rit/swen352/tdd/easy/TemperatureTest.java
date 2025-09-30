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
    public void testBasicConstructor(){
        Temperature temperature = new Temperature(0.0, TemperatureUnit.FAHRENHEIT);
    }

}
