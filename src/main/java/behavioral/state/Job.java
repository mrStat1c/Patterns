package behavioral.state;

import behavioral.state.states.OpenState;
import behavioral.state.states.State;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Job {

    private State state;
    @Getter
    @Setter
    private boolean alive;
    @Getter
    private List<String> stateHistory = new ArrayList<>();

    public Job() {
        this.state = new OpenState(this);
        this.alive = true;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void addStateInHistory(String stateName) {
        this.stateHistory.add(stateName);
    }

    public void start() {
        this.state.onProgress();
    }

    public void stop() {
        this.state.onCancel();
    }

    public void pause() {
        this.state.onWait();
    }

    public void finish() {
        this.state.onFinish();
    }

    //todo нужны какие-то методы, внутри которых будут вызываться методы из State
    // start, pause, stop ??
}
