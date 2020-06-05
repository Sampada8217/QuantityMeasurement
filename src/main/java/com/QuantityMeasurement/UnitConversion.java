package com.QuantityMeasurement;


public  class UnitConversion {

    public enum Unit {


        FEET {
            public double convert(double feet) {
                return feet * 12;
            }
        },

        INCH {
            public double convert(double inch) {
                return inch;
            }
        },
        YARD {
            public double convert(double yard) {
                return yard * 36;

            }
        },

        CENTIMETER {
            public double convert(double centi) {
                return centi / 2.50;


            }
        },
        GALLON {
            public double convert(double gallon) {
                return gallon * 3.785;
            }
        },
        LITRE {
            public double convert(double litre) {
                return litre;
            }

        },
        MILLI {
            public double convert(double milli) {
                return milli / 1000.0;
            }
        },

        KILOGRAM {
            public double convert(double kiloGram) {
                return kiloGram;
            }
        },
        GRAM {
            public double convert(double gram) {
                return gram / 1000;
            }
        },

        TONNE {
            public double convert(double tonne) {
                return tonne * 1000;
            }
        },

        FAHRENHEIT {
            public double convert(double fahrenheit) {
                return fahrenheit;
            }

        },
        CELSIUS{
            public double convert(double celsius) {
                return (celsius*1.8)+32;
            }
        };


        public double convert(double value) {
            return value;
        }
    }
}

