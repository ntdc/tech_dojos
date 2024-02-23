package com.ntatc.katas.tire;

public class SensorStub implements ISensor {
    private double pressure = 0;

    SensorStub(double value) {
        this.pressure = value;
    }

    public double popNextPressurePsiValue() {
        return pressure;
    }
}
