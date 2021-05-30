package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.primary.HierarchyUseCase;

import java.util.List;

public class DefaultHierarchyUseCase implements HierarchyUseCase {

    @Override
    public Hierarchy buildHierarchy(List<EmployeeSupervisor> employeeSupervisors) {
        return new Hierarchy(employeeSupervisors);
    }
}
