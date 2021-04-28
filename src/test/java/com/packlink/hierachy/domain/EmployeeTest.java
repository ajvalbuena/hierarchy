package com.packlink.hierachy.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class EmployeeTest {

    @Test
    public void findRootEmployee(){
        Employee employee = new Employee("Peter");
        assertThat(employee.find("Peter"), is(employee));
    }

    @Test
    public void notFindEmployee(){
        Employee employee = new Employee("Laura");
        assertThat(employee.find("Peter"), nullValue());
    }

    @Test
    public void findDeepEmployee(){
        Employee employee = new Employee("Peter", Arrays.asList(
                new Employee("Laura", Arrays.asList(
                        new Employee("Pepe")))));
        assertThat(employee.find("Pepe"), is(new Employee("Pepe")));
    }
}
