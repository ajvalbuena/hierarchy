package com.packlink.hierachy.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class HierachyTest {
    @Test
    public void onlyTwoEmployee() {
        Hierachy hierarchy = new Hierachy(Arrays.asList(new EmployeeSupervisor("Peter", "Barbara")));

        assertThat(hierarchy.root(), is(new Employee("Barbara", Arrays.asList(new Employee("Peter")))));
    }
}
