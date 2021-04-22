package com.packlink.hierachy.domain;

public class EmployeeSupervisor {
    private final String name;
    private final String supervisor;

    public EmployeeSupervisor(String name, String supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public String getSupervisor() {
        return supervisor;
    }
}
