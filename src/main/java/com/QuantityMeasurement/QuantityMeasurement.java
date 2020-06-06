package com.QuantityMeasurement;

public class QuantityMeasurement {

    private final UnitConversion.Unit unit;
    private final double value;

    public QuantityMeasurement(UnitConversion.Unit unit, Double value) {
        try {
            this.unit = unit;
            this.value = value;
        } catch (NullPointerException e) {
            throw new QuantityException(QuantityException.ExceptionType.NULL_VALUE_EXCEPTION,"NULL");
        }
    }

    public boolean compare(QuantityMeasurement thatQuantityMeasurement) {
            Double value1 = this.unit.convert(this.value);
            Double value2 = thatQuantityMeasurement.unit.convert(thatQuantityMeasurement.value);
            return value1.equals(value2);
    }

    public double addUnits(QuantityMeasurement that){
        Double value1=this.unit.convert(this.value);
        Double value2=that.unit.convert(that.value);
        return value1+value2;
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
