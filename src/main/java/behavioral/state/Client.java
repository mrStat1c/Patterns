package behavioral.state;

public class Client {

    public static void main(String[] args) {

        Job job = new Job();
        System.out.println("Job is alive ?  " + job.isAlive());
        job.start();
        job.pause();
        job.pause();
        job.finish();
        job.start();
        job.finish();
        System.out.println("Job is alive ?  " + job.isAlive());
        System.out.println("Job state history: " + job.getStateHistory());
    }
}
