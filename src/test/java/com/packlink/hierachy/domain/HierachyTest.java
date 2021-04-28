package com.packlink.hierachy.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class HierachyTest {
    @Test
    public void onlyTwoEmployee() {
        Hierachy hierarchy = new Hierachy(Arrays.asList(new EmployeeSupervisor("Peter", "Barbara")));

        assertThat(hierarchy.root(), is(new Employee("Barbara", Arrays.asList(new Employee("Peter")))));
    }

    @Test
    public void twoDifferentEmployees() {
        Hierachy hierarchy = new Hierachy(Arrays.asList(new EmployeeSupervisor("Patri", "Roberto")));

        assertThat(hierarchy.root(), is(new Employee("Roberto", Arrays.asList(new Employee("Patri")))));
    }

    @Test
    public void twoDifferentEmployeesOneSupervisor() {
        Hierachy hierarchy = new Hierachy(Arrays.asList(
                new EmployeeSupervisor("Patri", "Roberto"),
                new EmployeeSupervisor("Peter", "Roberto")
        ));

        assertThat(hierarchy.root(), is(
                new Employee("Roberto", Arrays.asList(
                        new Employee("Patri"),
                        new Employee("Peter")))));
    }
}
