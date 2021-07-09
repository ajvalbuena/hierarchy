package com.packlink.hierachy.infrastructure.controlllers;
import com.packlink.hierachy.domain.primary.HierarchyUseCase;
import com.packlink.hierachy.domain.repositories.EmployeeSupervisorRepository;
import com.packlink.hierachy.infrastructure.EmployeeSupervisorParser;
import com.packlink.hierachy.infrastructure.HierarchyEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Employee {
    private final HierarchyUseCase useCase;
    private final EmployeeSupervisorParser employeeSupervisorParser;
    private final HierarchyEncoder hierarchyEncoder = new HierarchyEncoder();

    @Autowired
    private EmployeeSupervisorRepository repository;

    @Autowired
    public Employee(HierarchyUseCase useCase, EmployeeSupervisorParser employeeSupervisorParser, EmployeeSupervisorRepository repository) {
        this.useCase = useCase;
        this.employeeSupervisorParser = employeeSupervisorParser;
        this.repository = repository;
    }

    @PostMapping("/hierarchy")
    public String create(@RequestBody Map<String, String> hierarchy){
        return hierarchyEncoder.toJson(useCase.getHierarchy(employeeSupervisorParser.toEmployeeSupervisor(hierarchy), repository));
    }

    @GetMapping("/")
    public String getHierarchy(){
        return "{\"Barbara\":{\"Pete\": {}}}";
    }

}
