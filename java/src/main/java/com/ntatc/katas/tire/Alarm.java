package com.ntatc.katas.tire;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    protected ISensor sensor;

    public Alarm(ISensor sensor) {
        this.sensor = sensor;
    }

    protected boolean alarmOn = false;

    public void check() {
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue) {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn() {
        return alarmOn;
    }
}