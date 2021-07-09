package com.packlink.hierachy.domain.primary;

import com.packlink.hierachy.domain.EmployeeSupervisor;
import com.packlink.hierachy.domain.Hierarchy;
import com.packlink.hierachy.domain.repositories.EmployeeSupervisorRepository;

import java.util.List;

public interface HierarchyUseCase {

    List<Hierarchy> getHierarchy(List<EmployeeSupervisor> employeeSupervisors, EmployeeSupervisorRepository repository);
}
