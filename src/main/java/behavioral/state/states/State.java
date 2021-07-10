package behavioral.state.states;

import behavioral.state.Job;

/** State life cycle:
 *
 *  Open -> In Progress -> Finished (final state)
 *                      <-> Waiting ->
 *       ->             ->            Cancelled (final state)
 */
public abstract class State {
    protected Job job;

    public State(Job job) {
        this.job = job;
        this.job.addStateInHistory(getStateName());
    }

    public abstract void onOpen();
    public abstract void onProgress();
    public abstract void onWait();
    public abstract void onFinish();
    public abstract void onCancel();

    protected String getStateName(){
        String classSimpleName = this.getClass().getSimpleName();
        return classSimpleName.substring(0, classSimpleName.indexOf("State"));
    }
}
