package com.packlink.hierachy.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefaultHierarchyUseCaseTest {

    DefaultHierarchyUseCase useCase = new DefaultHierarchyUseCase();

    @Test
    public void emptyHierarchy() {
        List<EmployeeSupervisor> input = Collections.emptyList();
        assertEquals(useCase.buildHierarchy(input), Collections.emptyList());
    }

    @Test
    public void onePairOfEmployeeSupervisor() {
        List<EmployeeSupervisor> input = Arrays.asList(new EmployeeSupervisor("Pepe", "Antonio"));
        Hierarchy finalHierarchy = new Hierarchy("Antonio", Arrays.asList(new Hierarchy("Pepe", Collections.emptyList())));
        assertEquals(useCase.buildHierarchy(input), Arrays.asList(finalHierarchy));
    }

    @Test
    public void testingEquals() {
        Hierarchy hierarchy3 = new Hierarchy("Susi", Arrays.asList(new Hierarchy("Tere", Collections.emptyList())));
        Hierarchy hierarchy1 = new Hierarchy("Antonio", Arrays.asList(new Hierarchy("Pepe", Collections.emptyList()), hierarchy3));
        Hierarchy hierarchy2 = new Hierarchy("Antonio", Arrays.asList(new Hierarchy("Pepe", Collections.emptyList()), hierarchy3));
        assertEquals(hierarchy1, hierarchy2);
    }

}
