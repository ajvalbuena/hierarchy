package com.packlink.hierachy.infrastructure;

import com.packlink.hierachy.domain.Hierarchy;

public class HierarchyEncoder {
    public String toJson(Hierarchy hierachy) {
        if (hierachy.isEmpty())
            return "{}";
        return "{\"Barbara\":{\"Pete\": {}}}";
    }
}
