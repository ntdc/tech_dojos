package com.ntatc.katas.tire;

public class SensorStub implements ISensor {
    private final double testedPressure;

    public SensorStub(double testedPressure) {
        this.testedPressure = testedPressure;
    }

    @Override
    public double popNextPressurePsiValue() {
        return this.testedPressure;
    }
}
