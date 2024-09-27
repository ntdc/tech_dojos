package com.ntatc.katas.tire;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlarmTest {

    @Test
    void givenPressureWhenEqualsTo17ThenAlarmIsOff() {
        // GIVEN
        ISensor sensor = new SensorStub(17);
        Alarm alarm = new Alarm(sensor);

        // WHEN
        alarm.check();

        // THEN
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void givenPressureWhenEqualsTo19ThenAlarmIsOff() {
        ISensor sensor = new SensorStub(19);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void givenPressureWhenEqualsTo21ThenAlarmIsOff() {
        ISensor sensor = new SensorStub(21);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void givenPressureWhenEqualsTo16ThenAlarmIsOn() {
        ISensor sensor = new SensorStub(16);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }

    @Test
    void givenPressureWhenEqualsTo22ThenAlarmIsOn() {
        ISensor sensor = new SensorStub(22);

        Alarm alarm = new Alarm(sensor);
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }
}