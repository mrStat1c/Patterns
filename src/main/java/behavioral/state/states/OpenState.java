package behavioral.state.states;

import behavioral.state.Job;

public class OpenState extends State {
    public OpenState(Job job) {
        super(job);
    }

    @Override
    public void onOpen() {
        System.out.println("Job is already in state \"Open\"!");
    }

    @Override
    public void onProgress() {
        this.job.changeState(new InProgressState(this.job));
        System.out.println("Job in state \"In Progress\"!");
    }

    @Override
    public void onWait() {
        System.out.println("Job can not transfer to state \"Waiting\" from state \"Open\"!");
    }

    @Override
    public void onFinish() {
        System.out.println("Job can not transfer to state \"Finished\" from state \"Open\"!");
    }

    @Override
    public void onCancel() {
        this.job.changeState(new CancelledState(this.job));
        System.out.println("Job in state \"Cancelled\"");
    }
}
