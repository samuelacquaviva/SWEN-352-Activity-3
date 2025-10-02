package edu.rit.swen352.tdd.easy;

import java.security.InvalidAlgorithmParameterException;
import java.util.InputMismatchException;

/**
 * An temperature measurement.
 *
 * <p>
 * You must implement these features:
 * <ul>
 *   <li>constructor:
 *     <ul>
 *       <li>with both a value as {@code double} and a unit</li>
 *       <li>with just a value; unit is defaulted to {@link TemperatureUnit#CELSIUS}</li>
 *       <li>NOTE: no temperature may be below absolute zero</li>
 *     </ul>
 *   </li>
 *   <li>convertTo(unit): create a new Temperature in the new unit</li>
 * </ul>
 */
public class Temperature {
  private double value;
  private TemperatureUnit unit;
  private static final double KELVIN_ABS_ZERO = 0;
  private static final double CELSIUS_ABS_ZERO = -273.15;
  private static final double FAHRENHEIT_ABS_ZERO = -459.67;

  public enum TemperatureUnit {
    CELSIUS, FAHRENHEIT, KELVIN;
  }

  public Temperature(double value, TemperatureUnit unit) {
    if(value < KELVIN_ABS_ZERO && unit == TemperatureUnit.KELVIN || value < CELSIUS_ABS_ZERO &&
    unit == TemperatureUnit.CELSIUS || value < FAHRENHEIT_ABS_ZERO && unit == TemperatureUnit.FAHRENHEIT){
      throw new IllegalArgumentException("ERROR: Values below absolute zero aren't permitted.");
    }else{
      this.value = value;
      this.unit = unit;
    }
  }

  public Temperature(double value) {
    if(value < CELSIUS_ABS_ZERO){
      throw new IllegalArgumentException("ERROR: Values below absolute zero aren't permitted.");
    }else{
      this.value = value;
      this.unit = TemperatureUnit.CELSIUS;
    }
  }

  public double getValue() {
    return value;
  }

  public TemperatureUnit getUnit() {
    return unit;
  }

  public Temperature convert(TemperatureUnit unit){
    if(this.getUnit() == TemperatureUnit.CELSIUS && unit == TemperatureUnit.FAHRENHEIT){
      double newValue = (this.getValue() * 9/5) + 32;
      return new Temperature(newValue, TemperatureUnit.FAHRENHEIT);
    }
    return new Temperature(0);
  } 
}
