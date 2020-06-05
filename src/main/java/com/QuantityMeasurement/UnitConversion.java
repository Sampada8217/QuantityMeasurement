package com.QuantityMeasurement;


public  class UnitConversion {

    public enum Unit {


        FEET {
            public double convert(double feet) {
                return feet ;
            }
        },

        INCH {
            public double convert(double inch) {
                return inch / 12.0;
            }
        },
        YARD {
            public double convert(double yard) {
                return yard * 3;

            }
        },

        CENTIMETER{
            public double convert(double centi){
                return centi / 30.0;


            }
        };

        public double convert(double value) {
            return value;
        }
    }
}

