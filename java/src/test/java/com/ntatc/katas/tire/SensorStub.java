package com.ntatc.katas.tire;

public class SensorStub implements ISensor {
    
    private double pressure;

    public SensorStub(double pressure){
        this.pressure = pressure;
    }

    @Override
    public double popNextPressurePsiValue() {
        return pressure;
    }
}
