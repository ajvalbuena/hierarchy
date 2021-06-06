package com.packlink.hierachy.infrastructure;

import com.packlink.hierachy.domain.Hierarchy;

import java.util.List;

public class HierarchyEncoder {
    public String toJson(List<Hierarchy> hierarchy) {
        if (hierarchy.isEmpty()) return "{}";
        Hierarchy firstHierarchy = hierarchy.get(0);
        String supervisor = firstHierarchy.getBoss();
        String employee = firstHierarchy.getEmployees().get(0).getBoss();
        return "{\""+supervisor+"\":{\""+employee+"\":{}}}";
    }
}
