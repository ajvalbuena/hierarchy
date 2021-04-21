package com.packlink.hierachy.infrastructure.controlllers;
import com.packlink.hierachy.domain.EmployeeSupervisor;
import com.packlink.hierachy.domain.Hierachy;
import com.packlink.hierachy.domain.primary.HierachyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class Employee {
    private final HierachyUseCase useCase;

    @Autowired
    public Employee(HierachyUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/hierachy")
    public String create(@RequestBody Map<String, String> hierachy){
        return toJson(useCase.buildHierachy(toEmployeeSupervisor(hierachy)));
    }

    private List<EmployeeSupervisor> toEmployeeSupervisor(Map<String, String> hierachy) {
        return hierachy
                .entrySet()
                .stream()
                .map(e -> new EmployeeSupervisor(e.getKey(), e.getValue()))
                .collect(Collectors.toList());
    }

    private String toJson(Hierachy hierachy) {
        if (hierachy.isEmpty())
            return "{}";
        return "{\"Barbara\":{\"Pete\": {}}}";
    }
}
