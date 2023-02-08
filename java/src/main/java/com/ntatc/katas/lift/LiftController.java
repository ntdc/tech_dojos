package com.ntatc.katas.lift;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;

@Slf4j
public class LiftController implements ILiftController {

    private int currentFloor;
    private List<Call> nextCalls = new ArrayList<>();

    public LiftController(int startFloor) {
        this.currentFloor = startFloor;
    }

    @Override
    public int getCurrentFloor() {
        return currentFloor;
    }

    @Override
    public Optional<Direction> getCurrentDirection() {
        // TODO
        return empty();
    }

    @Override
    public List<Call> getNextCalls() {
        return nextCalls;
    }

    @Override
    public LiftEngineCommand onFloor() {
        if (nextCalls.get(0).getFloor() > currentFloor) {
            currentFloor++;
        } else {
            currentFloor--;
        }

        return getLiftEngineCommand();

    }

    @Override
    public Optional<LiftEngineCommand> onDoorsClosed() {
        nextCalls.removeIf(call -> call.getFloor() == currentFloor);
        if (nextCalls.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(getLiftEngineCommand());
    }

    @Override
    public Optional<LiftEngineCommand> call(Call call) {
        nextCalls.add(call);

        return Optional.of(getLiftEngineCommand());
    }

    private LiftEngineCommand getLiftEngineCommand() {
        if (nextCalls.get(0).getFloor() == currentFloor) {
            return LiftEngineCommand.OPEN_DOORS;
        }

        if (currentFloor < nextCalls.get(0).getFloor()) {
            return LiftEngineCommand.GO_UP;
        } else {
            return LiftEngineCommand.GO_DOWN;
        }
    }

}
