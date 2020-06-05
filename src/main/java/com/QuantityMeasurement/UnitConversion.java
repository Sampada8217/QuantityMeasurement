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
        },
        GALLON {
            public double convert(double gallon) {
                return gallon * 3.785;
            }
        },
        LITRE{
            public double convert(double litre) {
                return litre;
            }

        },
        MILLI{
            public double convert(double milli) {
                return milli/1000.0;
            }
        };

        public double convert(double value) {
            return value;
        }
    }
}

