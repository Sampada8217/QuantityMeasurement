package com.QuantityMeasurement;

public class VolumeConversion {

    public enum Volume {

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
