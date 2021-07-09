package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.primary.HierarchyUseCase;
import com.packlink.hierachy.domain.repositories.EmployeeSupervisorRepository;
import com.packlink.hierachy.infrastructure.entity.EmployeeSupervisorEntity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultHierarchyUseCase implements HierarchyUseCase {

    @Override
    public List<Hierarchy> getHierarchy(List<EmployeeSupervisor> employeeSupervisors, EmployeeSupervisorRepository repository) {
        List<EmployeeSupervisorEntity> entities = toEmployeeSupervisorEntity(employeeSupervisors);
        entities.stream().map(x -> repository.save(x));
        return buildHierarchy(employeeSupervisors);
    }

    public static List<Hierarchy> buildHierarchy (List<EmployeeSupervisor> inputList){
        if(inputList.isEmpty()) return Collections.emptyList();
        EmployeeSupervisor employeeSupervisor = inputList.get(0);
        return Arrays.asList(new Hierarchy(employeeSupervisor.getSupervisor(),
                Arrays.asList(new Hierarchy(employeeSupervisor.getName(), Collections.emptyList()))));
    }

    public List<EmployeeSupervisorEntity> toEmployeeSupervisorEntity(List<EmployeeSupervisor> employeeSupervisors) {
        return employeeSupervisors
                .stream()
                .map(e -> new EmployeeSupervisorEntity(e.getName(), e.getSupervisor()))
                .collect(Collectors.toList());
    }

}
