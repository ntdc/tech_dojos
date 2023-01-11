package com.ntatc.katas.tire;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class AlarmTest {

    @Test
    void foo() {
        Alarm alarm = new Alarm();
        // alarm.check();
        assertFalse(alarm.isAlarmOn());
    }
}