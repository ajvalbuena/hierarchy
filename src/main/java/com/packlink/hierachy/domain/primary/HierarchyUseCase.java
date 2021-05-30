package com.packlink.hierachy.domain.primary;

import com.packlink.hierachy.domain.EmployeeSupervisor;
import com.packlink.hierachy.domain.Hierarchy;

import java.util.List;

public interface HierarchyUseCase {

    Hierarchy buildHierarchy(List<EmployeeSupervisor> employeeSupervisors);
}
