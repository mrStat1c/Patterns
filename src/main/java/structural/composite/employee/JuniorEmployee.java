package structural.composite.employee;

public class JuniorEmployee extends Employee {

    public JuniorEmployee(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(name + ": I don't understand anything...");
    }
}