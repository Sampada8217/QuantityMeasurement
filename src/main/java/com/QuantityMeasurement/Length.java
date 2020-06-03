package com.QuantityMeasurement;

import java.util.Objects;

public class Length {


    private static final double FEET_TO_INCH = 12;

    enum Unit{FEET,INCH};

    private final Unit unit;
    private final double value;

    public Length(Unit unit,double value) {
        this.unit=unit;
        this.value=value;
    }
    public boolean compare(Length thatLength){
      if(this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.FEET))
          return Double.compare(this.value,thatLength.value)==0;
      if(this.unit.equals(Unit.FEET) && thatLength.unit.equals(Unit.INCH))
            return Double.compare(this.value*FEET_TO_INCH,thatLength.value)==0;

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
