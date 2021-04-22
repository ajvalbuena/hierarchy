package com.packlink.hierachy.infrastructure;

import com.packlink.hierachy.domain.EmployeeSupervisor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSupervisorParser {
    public List<EmployeeSupervisor> toEmployeeSupervisor(Map<String, String> hierachy) {
        return hierachy
                .entrySet()
                .stream()
                .map(e -> new EmployeeSupervisor(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }
}
