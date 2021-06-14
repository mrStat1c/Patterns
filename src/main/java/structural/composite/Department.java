package structural.composite;

import structural.composite.employee.Leader;

public class Department {

    private Leader departmentLeader;

    public Department(Leader departmentLeader) {
        this.departmentLeader = departmentLeader;
    }

    public void startWorkDay() {
        this.departmentLeader.work();
    }

    public int getDepartmentSalary() {
        return this.departmentLeader.getGroupSalary();
    }
}