package behavioral.state.states;

import behavioral.state.Job;

public class WaitingState extends State {
    public WaitingState(Job job) {
        super(job);
    }

    @Override
    public void onOpen() {
        System.out.println("Impossible return jhe job in state \"Open\"!");
    }

    @Override
    public void onProgress() {
        this.job.changeState(new InProgressState(this.job));
        System.out.println("Job in state \"In Progress\"!");
    }

    @Override
    public void onWait() {
        System.out.println("Job is already in state \"Waiting\"");
    }

    @Override
    public void onFinish() {
        System.out.println("Job can not transfer to state \"Finished\" from state \"Waiting\"!");
    }

    @Override
    public void onCancel() {
        this.job.changeState(new CancelledState(this.job));
        System.out.println("Job in state \"Cancelled\"");
    }
}
