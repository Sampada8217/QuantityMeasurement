package com.QuantityMeasurement;

public class QuantityMeasurement {


    private static final double FEET_TO_INCH = 12;
    private static final double FEET_TO_YARD = 1.0 / 3.0;
    private static final double YARD_TO_INCH = 36;
    private static final double INCH_TO_YARD = 1.0 /36.0 ;
    private static final double YARD_TO_FEET = 3;
    private static final double INCH_TO_FEET = 1.0 / 12.0;

    enum Unit{FEET,INCH,YARD
    };

    private final Unit unit;
    private final double value;

    public QuantityMeasurement(Unit unit, Double value) {
        try {

            this.unit = unit;
            this.value = value;
        } catch (NullPointerException e) {

            throw new QuantityException(QuantityException.ExceptionType.NULL_VALUE_EXCEPTION,"NULL");
        }
    }
    public boolean compare(QuantityMeasurement thatQuantityMeasurement){
      if(this.unit.equals(Unit.FEET) && thatQuantityMeasurement.unit.equals(Unit.FEET))
          return Double.compare(this.value, thatQuantityMeasurement.value)==0;
        if(this.unit.equals(Unit.INCH) && thatQuantityMeasurement.unit.equals(Unit.INCH))
            return Double.compare(this.value, thatQuantityMeasurement.value)==0;
      if(this.unit.equals(Unit.FEET) && thatQuantityMeasurement.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH, thatQuantityMeasurement.value)==0;
        if(this.unit.equals(Unit.INCH) && thatQuantityMeasurement.unit.equals(Unit.FEET))
            return Double.compare(this.value*INCH_TO_FEET, thatQuantityMeasurement.value)==0;
        if(this.unit.equals(Unit.FEET) && thatQuantityMeasurement.unit.equals(Unit.YARD))
            return Double.compare(this.value*FEET_TO_YARD, thatQuantityMeasurement.value)==0;
        if(this.unit.equals(Unit.YARD) && thatQuantityMeasurement.unit.equals(Unit.INCH))
            return Double.compare(this.value*YARD_TO_INCH, thatQuantityMeasurement.value)==0;
        if(this.unit.equals(Unit.INCH) && thatQuantityMeasurement.unit.equals(Unit.YARD))
            return Double.compare(this.value*INCH_TO_YARD, thatQuantityMeasurement.value)==0;
        if(this.unit.equals(Unit.YARD) && thatQuantityMeasurement.unit.equals(Unit.FEET))
            return Double.compare(this.value*YARD_TO_FEET, thatQuantityMeasurement.value)==0;

      return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.value, value) == 0 &&
                unit == quantityMeasurement.unit;
    }

}
