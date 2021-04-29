package com.packlink.hierachy.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    public Optional<Employee> find(String name) {
        if (this.name.equals(name)) return Optional.of(this);
        return employees.stream()
                .map(e -> e.find(name))
                .filter(Optional::isPresent)
                .findFirst()
                .map(Optional::get);
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
