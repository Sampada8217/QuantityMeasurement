package com.QuantityMeasurement;


public  class UnitConversion {

    public enum Unit {


        FEET {
            public double convert(double feet) {
                return feet * 12 ;
            }
        },

        INCH {
            public double convert(double inch) {
                return inch ;
            }
        },
        YARD {
            public double convert(double yard) {
                return yard * 36;

            }
        },

        CENTIMETER{
            public double convert(double centi){
                return centi / 2.50;


            }
        };

        public double convert(double value) {
            return value;
        }
    }
}

