package com.ntatc.katas.lift;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LiftTest {

    private ILiftController lift = new LiftController(0);

    @Test
    void givenStartFloor1WhenGetCurrentFlowThenFloor1IsReturned() {
        // GIVEN
        lift = new LiftController(1);

        // WHEN
        int currentFloor = lift.getCurrentFloor();

        // THEN
        assertEquals(1, currentFloor);
    }

    @Test
    void givenNewCallWhenGetNextCallsThenCallIsPresent() {
        // GIVEN
        Call call = new Call(3);
        lift.call(call);

        // WHEN
        List<Call> calls = lift.getNextCalls();

        // THEN
        assertEquals(call, calls.get(0));
    }

    @Test
    void givenFloorWhenCallFromTheSameThenOpenDoor() {
        // GIVEN
        Call call = new Call(0);


        // WHEN
        Optional<LiftEngineCommand> command = lift.call(call);


        // THEN
        assertEquals(Optional.of(LiftEngineCommand.OPEN_DOORS), command);
    }

    @Test
    void givenCallFromAboveWhenCallThenMoveUp() {
        // GIVEN
        Call call = new Call(3);

        // WHEN
        Optional<LiftEngineCommand> command = lift.call(call);

        // THEN
        assertEquals(Optional.of(LiftEngineCommand.GO_UP), command);
    }

    @Test
    void givenCallFromBellowWhenCallThenMoveDown() {
        // GIVEN
        lift = new LiftController(3);
        Call call = new Call(0);

        // WHEN
        Optional<LiftEngineCommand> command = lift.call(call);

        // THEN
        assertEquals(Optional.of(LiftEngineCommand.GO_DOWN), command);
    }

    @Test
    void givenMovingUpCallWhenOnFloorThenFloorIsAscending() {
        // GIVEN
        Call call = new Call(3);

        // WHEN
        lift.call(call);
        lift.onFloor();

        // THEN
        assertEquals(1, lift.getCurrentFloor());

        lift.onFloor();
        assertEquals(2, lift.getCurrentFloor());

    }

    @Test
    void givenMovingDownCallWhenOnFloorThenFloorIsDescending() {
        // GIVEN
        lift = new LiftController(3);
        Call call = new Call(0);

        // WHEN
        lift.call(call);
        lift.onFloor();

        // THEN
        assertEquals(2, lift.getCurrentFloor());

        lift.onFloor();
        assertEquals(1, lift.getCurrentFloor());

    }

    @Test
    void givenCallFloor1WhenOnFloor1ThenOpenDoor() {
        // GIVEN
        Call call = new Call(1);

        // WHEN
        lift.call(call);
        LiftEngineCommand command = lift.onFloor();

        // THEN
        assertEquals(LiftEngineCommand.OPEN_DOORS, command);
    }

    @Test
    void givenMovingUpWhenFloorNotReachedThenKeepsGoUp() {
        // GIVEN
        Call call = new Call(2);

        // WHEN
        lift.call(call);
        LiftEngineCommand command = lift.onFloor();

        // THEN
        assertEquals(LiftEngineCommand.GO_UP, command);
    }

    @Test
    void givenMovingDownWhenFloorNotReachedThenKeepsGoDown() {
        // GIVEN
        lift = new LiftController(3);
        Call call = new Call(1);

        // WHEN
        lift.call(call);
        LiftEngineCommand command = lift.onFloor();

        // THEN
        assertEquals(LiftEngineCommand.GO_DOWN, command);
    }

    @Test
    void givenFloorReachedWhenCloseDoorThenCallIsRemoved() {
        // GIVEN
        Call call = new Call(1);

        // WHEN
        lift.call(call);
        lift.onFloor();
        lift.onDoorsClosed();

        // THEN
        List<Call> calls = lift.getNextCalls();
        assertEquals(0, calls.size());
    }

    @Test
    void givenTwoUpCallsWhenMovingThenMoveTwice() {
        // GIVEN
        Call call = new Call(1);
        Call call2 = new Call(2);

        // WHEN
        lift.call(call);
        lift.call(call2);

        lift.onFloor();
        Optional<LiftEngineCommand> commandAtFloor1 = lift.onDoorsClosed();

        assertEquals(Optional.of(LiftEngineCommand.GO_UP), commandAtFloor1);
    }

    @Test
    void givenNoMoreCallWhenDoorCloseThenStop() {
        // GIVEN
        Call call = new Call(1);

        // WHEN
        lift.call(call);

        lift.onFloor();
        Optional<LiftEngineCommand> commandAtFloor1 = lift.onDoorsClosed();

        assertEquals(Optional.empty(), commandAtFloor1);
    }


}
