package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.primary.HierachyUseCase;

import java.util.List;

public class DefaultHierachyUseCase implements HierachyUseCase {

    @Override
    public Hierachy buildHierachy(List<EmployeeSupervisor> employeeSupervisors) {
        return new Hierachy(employeeSupervisors);
    }
}
