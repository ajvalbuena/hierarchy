package com.packlink.hierachy.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
    private final String name;
    private final List<Employee> employees;

    public Employee(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Employee(String name) {
        this(name, new ArrayList<>());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(employees, employee.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees);
    }
}