package structural.composite.employee;

import lombok.Getter;

public abstract class Employee {

    protected String name;
    @Getter
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract void work();
}