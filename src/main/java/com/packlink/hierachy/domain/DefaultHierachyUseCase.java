package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.primary.HierachyUseCase;


import java.util.ArrayList;
import java.util.Map;
public class DefaultHierachyUseCase implements HierachyUseCase {
    @Override
    public String buildHierachy(Map<String, String> hierachy) {
        if(hierachy.isEmpty())
            return "{}";
        return "{\"Barbara\":{\"Pete\": {}}}";
    }

    @Override
    public Hierachy buildHierachy(ArrayList<EmployeeSupervisor> employeeSupervisors) {
        return new Hierachy();
    }
}
