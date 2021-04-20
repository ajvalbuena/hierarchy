package com.packlink.hierachy.infrastructure.controlllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class EmployeeHierachy {
    @PostMapping("/hierachy")
    public String hierachy(Map<String, String> hierachy){
        return "{}";
    }
}
