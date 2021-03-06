package com.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 0.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAndNullFeet_shouldThrowException() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, null);
            QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 0.0);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.NULL_VALUE_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenValueCheckForFeet_whenReferenceEquals_shouldReturnResult() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 10.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 10.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenValueCheckForFeet_whenTypeEquals_shouldReturnResult() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 5.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 5.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_shouldReturnEqual() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 0.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullInchAndNullInch_shouldThrowException() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, null);
            QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 0.0);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.NULL_VALUE_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenValueCheckForInch_whenReferenceEquals_shouldReturnResult() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 10.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 10.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenValueCheckForInch_whenTypeEquals_shouldReturnResult() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 5.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 5.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEquals() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0FeetAnd1Inch_shouldReturnNotEqualLength() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 0.0);
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
            boolean compareCheck = feet1.compare(inch1);
            Assert.assertFalse(compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION,e.type);
        }
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_shouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqualLength() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
            boolean compareCheck = feet1.compare(inch1);
            Assert.assertNotEquals(true, compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION, e.type);
        }
    }


    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqualLength() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
            QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
            boolean compareCheck = inch1.compare(feet1);
            Assert.assertNotEquals(true, compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION, e.type);
        }
    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertEquals(true, compareCheck);
    }


    @Test
    public void given12InchAnd1Feet_shouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 12.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 3.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqualLength() {
        try {
            QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
            QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
            boolean compareCheck = feet1.compare(yard1);
            Assert.assertFalse(compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION, e.type);
        }
    }

    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqualLength() {
        try {
            QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
            QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
            boolean compareCheck = inch1.compare(yard1);
            Assert.assertFalse(compareCheck);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION, e.type);
        }
    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqualLength() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 36.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqualLength() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_shouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        QuantityMeasurement centi1 = new QuantityMeasurement(UnitConversion.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch1.compare(centi1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_whenAddedBothValue_shouldReturnLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        double add = inch1.addUnits(inch2);
        Assert.assertEquals(4, add, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_whenAddedBothValue_shouldReturnResultLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        double add = feet1.addUnits(inch1);
        Assert.assertEquals(14, add, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAddedBothValue_shouldReturnResultLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        double add = feet1.addUnits(feet2);
        Assert.assertEquals(24, add, 0.0);
    }

    @Test
    public void given2InchAnd2Cm_whenAddedBothValue_shouldReturnResultLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        QuantityMeasurement centi1 = new QuantityMeasurement(UnitConversion.Unit.CENTIMETER, 2.5);
        double add = inch1.addUnits(centi1);
        Assert.assertEquals(3, add, 0.0);
    }

    @Test
    public void given1GallonAnLitres_shouldReturnEqualVolume() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(UnitConversion.Unit.GALLON, 1.0);
        QuantityMeasurement litre1 = new QuantityMeasurement(UnitConversion.Unit.LITRE, 3.785);
        boolean compareCheck = gallon1.compare(litre1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1LitreAnd1000ml_shouldReturnEqualVolume() {
        QuantityMeasurement litre1 = new QuantityMeasurement(UnitConversion.Unit.LITRE, 1.0);
        QuantityMeasurement milli1 = new QuantityMeasurement(UnitConversion.Unit.MILLI, 1000.0);
        boolean compareCheck = litre1.compare(milli1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3Litre_whenAddedBothValue_shouldReturnResult() {
        QuantityMeasurement gallon1 = new QuantityMeasurement(UnitConversion.Unit.GALLON, 1.0);
        QuantityMeasurement litre1 = new QuantityMeasurement(UnitConversion.Unit.LITRE, 3.785);
        double add = gallon1.addUnits(litre1);
        Assert.assertEquals(7.57, add, 0.0);
    }

    @Test
    public void given1LitreAnd1000Milli_whenAddedBothValue_shouldReturnResult() {
        QuantityMeasurement litre1 = new QuantityMeasurement(UnitConversion.Unit.LITRE, 1.0);
        QuantityMeasurement milli1 = new QuantityMeasurement(UnitConversion.Unit.MILLI, 1000.0);
        double add = litre1.addUnits(milli1);
        Assert.assertEquals(2, add, 0.0);
    }

    @Test
    public void given1KiloGramAnd1000Grams_shouldReturnEqual() {
        QuantityMeasurement kiloGram = new QuantityMeasurement(UnitConversion.Unit.KILOGRAM, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(UnitConversion.Unit.GRAM, 1000.0);
        boolean compareCheck = kiloGram.compare(gram);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd100KiloGrams_shouldThrowException() {
        try {
            QuantityMeasurement feet = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
            QuantityMeasurement kilogram = new QuantityMeasurement(UnitConversion.Unit.KILOGRAM, 100.0);
            boolean compare = feet.compare(kilogram);
            Assert.assertFalse(compare);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION, e.type);
        }
    }

    @Test
    public void given1YardAndKiloGrams_shouldThrowException() {
        try {
            QuantityMeasurement yard = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
            QuantityMeasurement kilogram = new QuantityMeasurement(UnitConversion.Unit.KILOGRAM, 1000.0);
            boolean compare = yard.compare(kilogram);
            Assert.assertFalse(compare);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION, e.type);
        }
    }

    @Test
    public void givenTempAndMilli_shouldThrowException() {
        try {
            QuantityMeasurement fahrenheit = new QuantityMeasurement(UnitConversion.Unit.FAHRENHEIT, 1.0);
            QuantityMeasurement milli = new QuantityMeasurement(UnitConversion.Unit.MILLI, 1.0);
            boolean compare=fahrenheit.compare(milli);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.WRONG_CONVERSION, e.type);
        }
    }

    @Test
    public void given1TonneAnd1000KiloGrams_shouldReturnEqual() {
        QuantityMeasurement tonne = new QuantityMeasurement(UnitConversion.Unit.TONNE, 1.0);
        QuantityMeasurement kiloGram = new QuantityMeasurement(UnitConversion.Unit.KILOGRAM, 1000.0);
        boolean compareCheck = kiloGram.compare(tonne);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1TonneAnd1000Gram_whenAddedBothValues_shouldReturnResult() {
        QuantityMeasurement tonne = new QuantityMeasurement(UnitConversion.Unit.TONNE, 1.0);
        QuantityMeasurement gram = new QuantityMeasurement(UnitConversion.Unit.GRAM, 1000.0);
        double add=tonne.addUnits(gram);
        Assert.assertEquals(1001,add,0.0);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_shouldReturnEqualTemperature() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(UnitConversion.Unit.FAHRENHEIT, 212.0);
        QuantityMeasurement celsius = new QuantityMeasurement(UnitConversion.Unit.CELSIUS, 100.0);
        boolean compareCheck=fahrenheit.compare(celsius);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenFahrenheitAndCelsius_shouldReturnEqualTemperature() {
        QuantityMeasurement fahrenheit = new QuantityMeasurement(UnitConversion.Unit.FAHRENHEIT, 500.0);
        QuantityMeasurement celsius = new QuantityMeasurement(UnitConversion.Unit.CELSIUS, 260.0);
        boolean compareCheck=fahrenheit.compare(celsius);
        Assert.assertTrue(compareCheck);
    }
}
