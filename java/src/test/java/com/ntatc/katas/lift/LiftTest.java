package com.ntatc.katas.lift;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class LiftTest {

    @Test
    void givenLiftAtStartFloor1WhenGetCurrentFloorThenReturn1() {

        //Given
        ILiftController lift = new LiftController(1);

        //When
        int currentFloor = lift.getCurrentFloor();

        //Then
        Assertions.assertThat(currentFloor).isEqualTo(1);
    }

    @Test
    void givenNewCallWhenGetNextCallThenCallIsPresent() {

        //Given
        ILiftController lift = new LiftController(0);
        Call newCall = new Call(1);

        //When
        lift.call(newCall);

        //Then
        var calls = lift.getNextCalls();

        Assertions.assertThat(calls).contains(newCall);


    }

    @Test
    void givenFloorZeroWhenCallSameFloorThenOpenDoor() {

        //Given
        ILiftController lift = new LiftController(0);
        Call newCall = new Call(0);

        //When
        Optional<LiftEngineCommand> action = lift.call(newCall);

        //Then
        Assertions.assertThat(action).hasValue(LiftEngineCommand.OPEN_DOORS);
    }

    @Test
    void givenFloorZeroWhenCallFloorOneThenGoUp() {

        //Given
        ILiftController lift = new LiftController(0);
        Call newCall = new Call(1);

        //When
        Optional<LiftEngineCommand> action = lift.call(newCall);

        //Then
        Assertions.assertThat(action).hasValue(LiftEngineCommand.GO_UP);
    }

    @Test
    void givenFloorOneWhenCallFloorZeroThenGoDown() {

        //Given
        ILiftController lift = new LiftController(1);
        Call newCall = new Call(0);

        //When
        Optional<LiftEngineCommand> action = lift.call(newCall);

        //Then
        Assertions.assertThat(action).hasValue(LiftEngineCommand.GO_DOWN);
    }

    @Test
    void givenFloorZeroAndCallFloorOneWhenOnFloorThenCurrentFloorIsOne() {

        //Given
        ILiftController lift = new LiftController(0);
        Call newCall = new Call(1);

        //When
        lift.call(newCall);
        lift.onFloor();

        //Then
        int currentFloor = lift.getCurrentFloor();
        Assertions.assertThat(currentFloor).isEqualTo(1);
    }

    @Test
    void givenFloorTwoAndCallFloorOneWhenOnFloorThenCurrentFloorIsOne() {

        //Given
        ILiftController lift = new LiftController(2);
        Call newCall = new Call(1);

        //When
        lift.call(newCall);
        lift.onFloor();

        //Then
        int currentFloor = lift.getCurrentFloor();
        Assertions.assertThat(currentFloor).isEqualTo(1);
    }

    @Test
    void givenFloorZeroAndCallFloorTwoWhenOnFloorOneThenCommandGoUp() {

        //Given
        ILiftController lift = new LiftController(0);
        Call newCall = new Call(2);

        //When
        lift.call(newCall);
        LiftEngineCommand command = lift.onFloor();

        //Then
        Assertions.assertThat(command).isEqualTo(LiftEngineCommand.GO_UP);
    }

    @Test
    void givenFloorTwoAndCallFloorZeroWhenOnFloorOneThenCommandGoDown() {

        //Given
        ILiftController lift = new LiftController(2);
        Call newCall = new Call(0);

        //When
        lift.call(newCall);
        LiftEngineCommand command = lift.onFloor();

        //Then
        Assertions.assertThat(command).isEqualTo(LiftEngineCommand.GO_DOWN);
    }

    @Test
    void givenFloorZeroAndCallFloorOneWhenOnFloorThenOpenDoor() {

        //Given
        ILiftController lift = new LiftController(0);
        Call firstFloor = new Call(1);

        //When
        lift.call(firstFloor);
        LiftEngineCommand command = lift.onFloor();

        //Then
        Assertions.assertThat(command).isEqualTo(LiftEngineCommand.OPEN_DOORS);

    }

    @Test
    void givenFloorCallOneWhenFloorOneReachedThenCallIsRemoved() {
        //Given
        ILiftController lift = new LiftController(0);
        Call firstFloor = new Call(1);

        //When
        lift.call(firstFloor);
        lift.onFloor();
        lift.onDoorsClosed();

        //Then
        var calls = lift.getNextCalls();
        Assertions.assertThat(calls).isEmpty();
        Assertions.assertThat(calls).doesNotContain(firstFloor);
    }

    @Test
    void givenFloorCallTwoWhenFloortreeReachedThenGoUpToFloorTwo() {
        //Given
        ILiftController lift = new LiftController(0);
        Call firstFloorCall = new Call(1);
        Call secondFloorCall = new Call(2);

        //When
        lift.call(firstFloorCall);
        lift.call(secondFloorCall);
        lift.onFloor();
        var command = lift.onDoorsClosed();

        //Then
        Assertions.assertThat(command).hasValue(LiftEngineCommand.GO_UP);
    }


}
