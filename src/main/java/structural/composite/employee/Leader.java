package structural.composite.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Composite
 */
public class Leader extends Employee {

    private List<Employee> subardinates = new ArrayList<>();

    public Leader(String name, int salary, Employee... subardinates) {
        super(name, salary);
        if (subardinates.length == 0) {
            throw new RuntimeException("Leader must have subardinates!");
        }
        this.subardinates.addAll(Arrays.asList(subardinates));
    }

    @Override
    public void work() {
        System.out.println(name + ": Need to do it yesterday...");
        subardinates.forEach(Employee::work);
    }

    public int getGroupSalary() {
        int groupSalary = this.getSalary();
        for (Employee employee : subardinates) {
            groupSalary += employee instanceof Leader ?
                    ((Leader) employee).getGroupSalary() :
                    employee.getSalary();
        }
        return groupSalary;
    }
}