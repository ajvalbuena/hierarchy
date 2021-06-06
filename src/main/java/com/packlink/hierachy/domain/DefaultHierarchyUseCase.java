package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.primary.HierarchyUseCase;

import java.util.List;

public class DefaultHierarchyUseCase implements HierarchyUseCase {

    @Override
    public List<Hierarchy> buildHierarchy(List<EmployeeSupervisor> employeeSupervisors) {
        return Hierarchy.findHierarchy(employeeSupervisors);
    }
}
