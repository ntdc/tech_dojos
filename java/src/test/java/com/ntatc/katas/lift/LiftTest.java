package com.ntatc.katas.lift;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LiftTest {

    @Test
    void givenFloor1_WhenGetCurrentFloor_ThenCurrentFloorEquals1() {
        //Given
        var lift = new LiftController(1);
        //When
        var currentFloor = lift.getCurrentFloor();
        //Then
        assertEquals(currentFloor, 1);
    }

    @Test
    void givenFloor2_WhenGetCurrentFloor_ThenCurrentFloorEquals2() {
        //Given
        var lift = new LiftController(2);
        //When
        var currentFloor = lift.getCurrentFloor();
        //Then
        assertEquals(currentFloor, 2);
    }

    @Test
    void givenCallFloor2_WhenGetNextCalls_ThenCallIsPresent() {
        //Given
        var call = new Call(2);
        var lift = new LiftController(0);
        lift.call(call);
        //When
        List<Call> result = lift.getNextCalls();
        //Then
        assertEquals(call, result.get(0));
    }

    @Test
    void givenFloor_WhenCallFromSameFloor_ThenOpenDoors() {
        //Given
        Call call = new Call(2);
        ILiftController lift = new LiftController(2);
        //When
        Optional<LiftEngineCommand> result = lift.call(call);
        //Then
        assertEquals(Optional.of(LiftEngineCommand.OPEN_DOORS), result);
    }

    @Test
    void givenFloor_WhenCallFromAboveFloor_ThenUp() {
        //Given
        Call call = new Call(3);
        ILiftController lift = new LiftController(1);
        //When
        Optional<LiftEngineCommand> result = lift.call(call);
        //Then
        assertEquals(Optional.of(LiftEngineCommand.GO_UP), result);
    }

    @Test
    void givenFloor_WhenCallFromBelowFloor_ThenDown() {
        //Given
        Call call = new Call(1);
        ILiftController lift = new LiftController(3);
        //When
        Optional<LiftEngineCommand> result = lift.call(call);
        //Then
        assertEquals(Optional.of(LiftEngineCommand.GO_DOWN), result);
    }

    @Test
    void givenMovingUpCalls_WhenOnFloor_ThenCurrentFloorIsAscending() {
        //Given
        Call call = new Call(3);
        ILiftController lift = new LiftController(1);
        lift.call(call);

        //When
        lift.onFloor();
        //Then
        assertEquals(2, lift.getCurrentFloor());
        lift.onFloor();
        assertEquals(3, lift.getCurrentFloor());
    }

    @Test
    void givenMovingDownCalls_WhenOnFloor_ThenCurrentFloorIsDescending() {
        //Given
        Call call = new Call(1);
        ILiftController lift = new LiftController(3);
        lift.call(call);

        //When
        lift.onFloor();
        //Then
        assertEquals(2, lift.getCurrentFloor());
        lift.onFloor();
        assertEquals(1, lift.getCurrentFloor());
    }

    @Test
    void givenCallFloor2_WhenOnFloor2_ThenOpenDoors() {
        //Given
        ILiftController lift = new LiftController(1);
        Call call = new Call(2);
        lift.call(call);

        //When
        LiftEngineCommand command = lift.onFloor();
        //Then
        assertEquals(LiftEngineCommand.OPEN_DOORS, command);
    }

    @Test
    void givenCallFloor3_WhenOnFloor2_ThenUp() {
        //Given
        ILiftController lift = new LiftController(1);
        Call call = new Call(3);
        lift.call(call);

        //When
        LiftEngineCommand command = lift.onFloor();

        //Then
        assertEquals(LiftEngineCommand.GO_UP, command);
    }

    @Test
    void givenCallFloor1_WhenOnFloor2_ThenUDown() {
        //Given
        ILiftController lift = new LiftController(3);
        Call call = new Call(1);
        lift.call(call);

        //When
        LiftEngineCommand command = lift.onFloor();

        //Then
        assertEquals(LiftEngineCommand.GO_DOWN, command);
    }

    @Test
    void givenFloorReached_WhenOnDoorClosed_ThenCallIsRemoved() {
        //Given
        var call = new Call(0);
        var lift = new LiftController(0);
        lift.call(call);
        //When
        lift.onDoorsClosed();
        List<Call> result = lift.getNextCalls();

        //Then
        assertEquals(0, result.size());
    }

}
