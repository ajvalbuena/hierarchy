package com.packlink.hierachy.infrastructure;

import com.packlink.hierachy.domain.DefaultHierachyUseCase;
import com.packlink.hierachy.domain.primary.HierachyUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public HierachyUseCase hierachyUseCase(){
        return new DefaultHierachyUseCase();
    }
    @Bean
    public EmployeeSupervisorParser employeeSupervisorParser() { return new EmployeeSupervisorParser(); }
}
