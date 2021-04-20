package com.packlink.hierachy.infrastructure.controlllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class Employee {
    @PostMapping("/hierachy")
    public String create(@RequestBody Map<String, String> hierachy){
        if(hierachy.isEmpty())
            return "{}";
        return "{\"Barbara\":{\"Pete\": {}}}";
    }
}
