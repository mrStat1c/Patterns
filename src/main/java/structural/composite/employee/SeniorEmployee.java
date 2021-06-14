package structural.composite.employee;

public class SeniorEmployee extends Employee {

    public SeniorEmployee(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + ": Kill me please...");
    }
}