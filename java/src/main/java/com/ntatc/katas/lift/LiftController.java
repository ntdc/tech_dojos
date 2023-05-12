package com.ntatc.katas.lift;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;

@Slf4j
public class LiftController implements ILiftController {

    private int currentFloor;
    private final List<Call> calls = new ArrayList<>();

    public LiftController(int startFloor) {
        this.currentFloor = startFloor;
    }

    @Override
    public int getCurrentFloor() {
        return this.currentFloor;
    }

    @Override
    public Optional<Direction> getCurrentDirection() {
        // TODO
        return empty();
    }

    @Override
    public List<Call> getNextCalls() {
        return calls;
    }

    @Override
    public LiftEngineCommand onFloor() {
        if (isNextCallFloorAboveCurrentFloor()) {
            currentFloor++;
        } else {
            currentFloor--;
        }

        return getLiftEngineCommand();
    }


    @Override
    public Optional<LiftEngineCommand> onDoorsClosed() {
        calls.removeIf(call -> call.getFloor() == currentFloor);
        if (getNextCalls().isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(getLiftEngineCommand());
    }

    @Override
    public Optional<LiftEngineCommand> call(Call call) {
        calls.add(call);
        return Optional.of(getLiftEngineCommand());
    }

    private LiftEngineCommand getLiftEngineCommand() {
        if (getNextCalls().get(0).getFloor() == currentFloor) {
            return LiftEngineCommand.OPEN_DOORS;
        }

        if (isNextCallFloorAboveCurrentFloor()) {
            return LiftEngineCommand.GO_UP;
        } else {
            return LiftEngineCommand.GO_DOWN;
        }
    }

    private boolean isNextCallFloorAboveCurrentFloor() {
        return getNextCalls().get(0).getFloor() > currentFloor;
    }

}
