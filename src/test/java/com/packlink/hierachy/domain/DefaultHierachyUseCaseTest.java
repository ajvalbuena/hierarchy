package com.packlink.hierachy.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DefaultHierachyUseCaseTest {
    @Test
    public void emptyEmployees(){
        DefaultHierachyUseCase hierachyUseCase = new DefaultHierachyUseCase();
        assertThat(hierachyUseCase.buildHierachy(new ArrayList<>()), is(new Hierachy(new ArrayList<>())));
    }
}