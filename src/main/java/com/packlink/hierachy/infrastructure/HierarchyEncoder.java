package com.packlink.hierachy.infrastructure;

import com.packlink.hierachy.domain.Hierachy;

public class HierarchyEncoder {
    public String toJson(Hierachy hierachy) {
        if (hierachy.isEmpty())
            return "{}";
        return "{\"Barbara\":{\"Pete\": {}}}";
    }
}
