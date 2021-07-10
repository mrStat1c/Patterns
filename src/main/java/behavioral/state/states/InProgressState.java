package behavioral.state.states;

import behavioral.state.Job;

public class InProgressState extends State {
    public InProgressState(Job job) {
        super(job);
    }

    @Override
    public void onOpen() {
        System.out.println("Impossible return jhe job in state \"Open\"!");
    }

    @Override
    public void onProgress() {
        System.out.println("Job is already in state \"In Progress\"!");
    }

    @Override
    public void onWait() {
        this.job.changeState(new WaitingState(this.job));
        System.out.println("Job in state \"Waiting\"");
    }

    @Override
    public void onFinish() {
        this.job.changeState(new FinishedState(this.job));
        System.out.println("Job in state \"Finished\"");
    }

    @Override
    public void onCancel() {
        this.job.changeState(new CancelledState(this.job));
        System.out.println("Job in state \"Cancelled\"");
    }
}
