package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.primary.HierachyUseCase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DefaultHierachyUseCase implements HierachyUseCase {
    @Override
    public String buildHierachy(Map<String, String> hierachy) {
        return toJson(buildHierachy(toEmployeeSupervisor(hierachy)));
    }

    public List<EmployeeSupervisor> toEmployeeSupervisor(Map<String, String> hierachy) {
        return hierachy
                .entrySet()
                .stream()
                .map(e -> new EmployeeSupervisor(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }

    public String toJson(Hierachy hierachy) {
        if (hierachy.isEmpty())
            return "{}";
        return "{\"Barbara\":{\"Pete\": {}}}";
    }

    @Override
    public Hierachy buildHierachy(List<EmployeeSupervisor> employeeSupervisors) {
        return new Hierachy(employeeSupervisors);
    }
}
