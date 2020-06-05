package com.QuantityMeasurement;

public class Volume {
    private final VolumeConversion.Volume volume;
    private final double value;

    public Volume(VolumeConversion.Volume volume, double value) {

        this.volume=volume;
        this.value = value;

    }

    public boolean compareVolumes(Volume thatVolume){
        Double value1=this.volume.convert(this.value);
        Double value2=thatVolume.volume.convert(thatVolume.value);
        return value1.equals(value2);


    }

    public double addVolumes(Volume thatVolume) {

        Double value1=this.volume.convert(this.value);
        Double value2=thatVolume.volume.convert(thatVolume.value);
        return value1+value2;

    }
}
