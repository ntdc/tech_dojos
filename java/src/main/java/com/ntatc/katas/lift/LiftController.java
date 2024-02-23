package com.ntatc.katas.lift;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        if (calls.isEmpty()) {
            return Optional.empty();
        }
        if (LiftEngineCommand.GO_UP.equals(getLiftEngineCommand())) {
            return Optional.of(Direction.UP);
        }
        if (LiftEngineCommand.GO_DOWN.equals(getLiftEngineCommand())) {
            return Optional.of(Direction.DOWN);
        }
        return Optional.empty();
    }

    @Override
    public List<Call> getNextCalls() {
        return calls;
    }

    @Override
    public LiftEngineCommand onFloor() {
        if (currentFloor < calls.get(0).getFloor()) {
            currentFloor++;
        } else {
            currentFloor--;
        }
        return getLiftEngineCommand();
    }

    @Override
    public Optional<LiftEngineCommand> onDoorsClosed() {
        this.calls.removeIf(call -> call.getFloor() == this.currentFloor);
        if (calls.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(this.getLiftEngineCommand());
    }

    @Override
    public Optional<LiftEngineCommand> call(Call call) {
        this.calls.add(call);
        return Optional.of(this.getLiftEngineCommand());
    }

    private LiftEngineCommand getLiftEngineCommand() {
        if (this.calls.get(0).getFloor() < this.currentFloor) {
            return LiftEngineCommand.GO_DOWN;
        }
        if (this.calls.get(0).getFloor() == this.currentFloor) {
            return LiftEngineCommand.OPEN_DOORS;
        } else {
            return LiftEngineCommand.GO_UP;
        }
    }

}
