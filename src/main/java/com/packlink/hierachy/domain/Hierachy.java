package com.packlink.hierachy.domain;

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
}
