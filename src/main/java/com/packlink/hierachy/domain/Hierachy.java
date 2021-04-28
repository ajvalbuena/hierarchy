package com.packlink.hierachy.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hierachy {

    private final List<EmployeeSupervisor> employeeSupervisors;

    public Hierachy(List<EmployeeSupervisor> employeeSupervisors) {
        this.employeeSupervisors = employeeSupervisors;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    public boolean isEmpty() {
        return employeeSupervisors.isEmpty();
    }

    public Employee root() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new Employee(employeeSupervisors.get(0).getName()));
        if(employeeSupervisors.size() > 1){
            employeeList.add(new Employee(employeeSupervisors.get(1).getName()));
        }

        return new Employee(employeeSupervisors.get(0).getSupervisor(), employeeList);
    }
}
