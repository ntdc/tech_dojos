package com.ntatc.katas.lift;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.empty;

@Slf4j
public class LiftController implements ILiftController {


    public LiftController(int startFloor) {

    }

    @Override
    public int getCurrentFloor() {
        return 0;
    }

    @Override
    public Optional<Direction> getCurrentDirection() {
        // TODO
        return empty();
    }

    @Override
    public List<Call> getNextCalls() {
        return new ArrayList<>();
    }

    @Override
    public LiftEngineCommand onFloor() {
        // TODO
        return null;

    }

    @Override
    public Optional<LiftEngineCommand> onDoorsClosed() {
        // TODO
        return Optional.empty();
    }

    @Override
    public Optional<LiftEngineCommand> call(Call call) {
        // TODO
        return Optional.empty();
    }

}
