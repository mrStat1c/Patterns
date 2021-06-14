package structural.composite.employee;

public class MiddleEmployee extends Employee {

    public MiddleEmployee(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + ": All right, bro...");
    }
}