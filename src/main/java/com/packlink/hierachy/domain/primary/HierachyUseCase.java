package com.packlink.hierachy.domain.primary;

import com.packlink.hierachy.domain.EmployeeSupervisor;
import com.packlink.hierachy.domain.Hierachy;

import java.util.List;

public interface HierachyUseCase {

    Hierachy buildHierachy(List<EmployeeSupervisor> employeeSupervisors);
}
