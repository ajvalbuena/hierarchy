package com.packlink.hierachy.domain.primary;

import com.packlink.hierachy.domain.EmployeeSupervisor;
import com.packlink.hierachy.domain.Hierachy;

import java.util.List;
import java.util.Map;

public interface HierachyUseCase {
    String buildHierachy(Map<String, String> hierachy);

    Hierachy buildHierachy(List<EmployeeSupervisor> employeeSupervisors);
}
