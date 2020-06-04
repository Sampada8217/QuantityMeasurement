package com.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);

    }

    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullFeetAndNullFeet_shouldThrowException() {
        try {

            Length feet1 = new Length(Length.Unit.FEET, null);
            Length feet2 = new Length(Length.Unit.FEET, null);
            Assert.assertEquals(feet1,feet2);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.NULL_VALUE_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenValueCheckForFeet_whenReferenceEquals_shouldReturnResult() {
        Length feet1 = new Length(Length.Unit.FEET, 10.0);
        Length feet2 = new Length(Length.Unit.FEET, 10.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenValueCheckForFeet_whenTypeEquals_shouldReturnResult() {
        Length feet1 = new Length(Length.Unit.FEET, 5.0);
        Length feet2 = new Length(Length.Unit.FEET, 5.0);
        Assert.assertEquals(feet1, feet2);
    }


    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);

    }

    @Test
    public void given0InchAnd1Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);

    }

    @Test
    public void givenNullInchAndNullInch_shouldThrowException() {
        try {

            Length inch1 = new Length(Length.Unit.INCH, null);
            Length inch2 = new Length(Length.Unit.INCH, null);
            Assert.assertEquals(inch1,inch2);
        } catch (QuantityException e) {
            Assert.assertEquals(QuantityException.ExceptionType.NULL_VALUE_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenValueCheckForInch_whenReferenceEquals_shouldReturnResult() {
        Length inch1 = new Length(Length.Unit.INCH, 10.0);
        Length inch2 = new Length(Length.Unit.INCH, 10.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenValueCheckForInch_whenTypeEquals_shouldReturnResult() {
        Length inch1 = new Length(Length.Unit.INCH, 5.0);
        Length inch2 = new Length(Length.Unit.INCH, 5.0);
        Assert.assertEquals(inch1, inch2);
    }


    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(feet1, inch1);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given0FeetAnd1Inch_shouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd1Feet_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd1Inch_shouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = inch1.compare(inch2);
        Assert.assertEquals(true, compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assert.assertNotEquals(true, compareCheck);

    }

    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertNotEquals(true, compareCheck);

    }

    @Test
    public void given1FeetAnd12Inch_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertEquals(true, compareCheck);

    }

    @Test
    public void given12InchAnd1Feet_shouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 12.0);
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = inch1.compare(feet1);
        Assert.assertEquals(true,compareCheck);

    }

    @Test
    public void given3FeetAnd1Yard_shouldReturnEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 3.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertEquals(true, compareCheck);

    }

    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqualLength() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = feet1.compare(yard1);
        Assert.assertNotEquals(true, compareCheck);

    }


    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertNotEquals(true, compareCheck);

    }

    @Test
    public void given1YardAnd36Inch_shouldReturnEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard1.compare(inch1);
        Assert.assertEquals(true, compareCheck);

    }

    @Test
    public void given36InchAnd1Yard_shouldReturnEqualLength() {
        Length inch1 = new Length(Length.Unit.INCH, 36.0);
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch1.compare(yard1);
        Assert.assertEquals(true, compareCheck);

    }

    @Test
    public void given1YardAnd3Feet_shouldReturnEqualLength() {
        Length yard1 = new Length(Length.Unit.YARD, 1.0);
        Length feet1 = new Length(Length.Unit.FEET, 3.0);
        boolean compareCheck = yard1.compare(feet1);
        Assert.assertEquals(true, compareCheck);

    }


}
