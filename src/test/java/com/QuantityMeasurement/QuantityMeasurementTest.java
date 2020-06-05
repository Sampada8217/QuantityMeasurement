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
            QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, null);
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
            QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, null);
            Assert.assertEquals(inch1,inch2);
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
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 0.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
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
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertNotEquals(true, compareCheck);

    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertNotEquals(true, compareCheck);

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
        Assert.assertEquals(true,compareCheck);

    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 3.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertEquals(true, compareCheck);

    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqualLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertNotEquals(true, compareCheck);

    }


    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 1.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertNotEquals(true, compareCheck);

    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqualLength() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertEquals(true, compareCheck);

    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 36.0);
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertEquals(true, compareCheck);

    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqualLength() {
        QuantityMeasurement yard1 = new QuantityMeasurement(UnitConversion.Unit.YARD, 1.0);
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertEquals(true, compareCheck);

    }
    @Test
    public void given2InchAnd5Cm_shouldReturnEqualLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        QuantityMeasurement centi1 = new QuantityMeasurement(UnitConversion.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch1.compare(centi1);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_whenAddedBothValue_shouldReturnLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        QuantityMeasurement inch2 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        double add=inch1.addCompare(inch2);
        Assert.assertEquals(4,add,0.0);
    }

    @Test
    public void given1FeetAnd2Inch_whenAddedBothValue_shouldReturnResultLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        double add=feet1.addCompare(inch1);
        Assert.assertEquals(14,add,0.0);
    }

    @Test
    public void given1FeetAnd1Feet_whenAddedBothValue_shouldReturnResultLength() {
        QuantityMeasurement feet1 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        QuantityMeasurement feet2 = new QuantityMeasurement(UnitConversion.Unit.FEET, 1.0);
        double add=feet1.addCompare(feet2);
        Assert.assertEquals(24,add,0.0);
    }


    @Test
    public void given2InchAnd2Cm_whenAddedBothValue_shouldReturnResultLength() {
        QuantityMeasurement inch1 = new QuantityMeasurement(UnitConversion.Unit.INCH, 2.0);
        QuantityMeasurement centi1 = new QuantityMeasurement(UnitConversion.Unit.CENTIMETER, 2.5);
        double add=inch1.addCompare(centi1);
        Assert.assertEquals(3,add,0.0);
    }

    @Test
    public void given1GallonAnLitres_shouldReturnEqualVolume() {
        Volume gallon1 = new Volume(VolumeConversion.Volume.GALLON, 1.0);
        Volume litre1 = new Volume(VolumeConversion.Volume.LITRE, 3.785);
        boolean compareCheck=gallon1.compareVolumes(litre1);
        Assert.assertTrue(compareCheck);
    }

}
