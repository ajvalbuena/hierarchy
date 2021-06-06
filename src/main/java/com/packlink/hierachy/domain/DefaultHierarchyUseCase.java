package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.primary.HierarchyUseCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultHierarchyUseCase implements HierarchyUseCase {

    @Override
    public List<Hierarchy> getHierarchy(List<EmployeeSupervisor> employeeSupervisors) {
        return buildHierarchy(employeeSupervisors);
    }

    public static List<Hierarchy> buildHierarchy (List<EmployeeSupervisor> inputList){
        if(inputList.isEmpty()) return Collections.emptyList();
        EmployeeSupervisor employeeSupervisor = inputList.get(0);
        return Arrays.asList(new Hierarchy(employeeSupervisor.getSupervisor(),
                Arrays.asList(new Hierarchy(employeeSupervisor.getName(), Collections.emptyList()))));
    }

}
