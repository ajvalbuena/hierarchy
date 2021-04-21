package com.packlink.hierachy.infrastructure;

import com.packlink.hierachy.domain.DefaultHierachyUseCase;
import com.packlink.hierachy.domain.primary.HierachyUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HierachyConfiguration {
    @Bean
    public HierachyUseCase hierachyUseCase(){
        return new DefaultHierachyUseCase();
    }
}
