package com.ntatc.katas.tire;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlarmTest {

    @Test
    void foo() {
        Alarm alarm = new Alarm(new SensorStub(20));
        alarm.check();
        assertFalse(alarm.isAlarmOn());
    }

    @Test
    void bar() {
        Alarm alarm = new Alarm(new SensorStub(5));
        alarm.check();
        assertTrue(alarm.isAlarmOn());
    }
}