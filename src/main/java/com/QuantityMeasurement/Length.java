package com.QuantityMeasurement;

public class Length {


    private static final double FEET_TO_INCH = 12;
    private static final double FEET_TO_YARD = 0.3333333333333;
    private static final double YARD_TO_INCH = 36;
    private static final double INCH_TO_YARD = 1/36;

    enum Unit{FEET,INCH,YARD
    };

    private final Unit unit;
    private final double value;

    public Length(Unit unit, Double value) {
        try {

            this.unit = unit;
            this.value = value;
        } catch (NullPointerException e) {

            throw new QuantityException(QuantityException.ExceptionType.NULL_VALUE_EXCEPTION,"NULL");
        }
    }
    public boolean compare(Length thatLength){
      if(this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.FEET))
          return Double.compare(this.value,thatLength.value)==0;
        if(this.unit.equals(Unit.INCH) && thatLength.unit.equals(Unit.INCH))
            return Double.compare(this.value,thatLength.value)==0;
      if(this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH,thatLength.value)==0;
        if(this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.YARD))
            return Double.compare(this.value*FEET_TO_YARD,thatLength.value)==0;
        if(this.unit.equals(Unit.YARD) && thatLength.unit.equals(Unit.INCH))
            return Double.compare(this.value*YARD_TO_INCH,thatLength.value)==0;
        if(this.unit.equals(Unit.INCH) && thatLength.unit.equals(Unit.YARD))
            return Double.compare(this.value*INCH_TO_YARD,thatLength.value)==0;

      return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

}
