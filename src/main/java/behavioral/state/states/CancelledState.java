package behavioral.state.states;

import behavioral.state.Job;

public class CancelledState extends State {
    public CancelledState(Job job) {
        super(job);
        this.job.setAlive(false);
    }

    @Override
    public void onOpen() {
        System.out.println("Impossible return jhe job in state \"Open\"!");
    }

    @Override
    public void onProgress() {
        System.out.println("The job in state \"Cancelled\" No further action possible!");
    }

    @Override
    public void onWait() {
        System.out.println("The job in state \"Cancelled\" No further action possible!");
    }

    @Override
    public void onFinish() {
        System.out.println("The job in state \"Cancelled\" No further action possible!");
    }

    @Override
    public void onCancel() {
        System.out.println("The job in state \"Cancelled\" No further action possible!");
    }
}
