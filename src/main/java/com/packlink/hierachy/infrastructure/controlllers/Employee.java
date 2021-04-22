package com.packlink.hierachy.infrastructure.controlllers;
import com.packlink.hierachy.domain.Hierachy;
import com.packlink.hierachy.domain.primary.HierachyUseCase;
import com.packlink.hierachy.infrastructure.EmployeeSupervisorParser;
import com.packlink.hierachy.infrastructure.HierarchyEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Employee {
    private final HierachyUseCase useCase;
    private final EmployeeSupervisorParser employeeSupervisorParser;
    private final HierarchyEncoder hierarchyEncoder = new HierarchyEncoder();

    @Autowired
    public Employee(HierachyUseCase useCase, EmployeeSupervisorParser employeeSupervisorParser) {
        this.useCase = useCase;
        this.employeeSupervisorParser = employeeSupervisorParser;
    }

    @PostMapping("/hierachy")
    public String create(@RequestBody Map<String, String> hierachy){
        return hierarchyEncoder.toJson(useCase.buildHierachy(employeeSupervisorParser.toEmployeeSupervisor(hierachy)));
    }
}
