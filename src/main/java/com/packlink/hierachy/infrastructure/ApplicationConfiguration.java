package com.packlink.hierachy.infrastructure;

import com.packlink.hierachy.domain.DefaultHierarchyUseCase;
import com.packlink.hierachy.domain.primary.HierarchyUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public HierarchyUseCase hierachyUseCase(){
        return new DefaultHierarchyUseCase();
    }
    @Bean
    public EmployeeSupervisorParser employeeSupervisorParser() { return new EmployeeSupervisorParser(); }
}
