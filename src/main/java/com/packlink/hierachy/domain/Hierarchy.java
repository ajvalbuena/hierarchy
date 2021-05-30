package com.packlink.hierachy.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hierarchy {

    private final List<EmployeeSupervisor> employeeSupervisors;

    public Hierarchy(List<EmployeeSupervisor> employeeSupervisors) {
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
