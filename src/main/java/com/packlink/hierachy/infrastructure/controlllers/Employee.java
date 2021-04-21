package com.packlink.hierachy.infrastructure.controlllers;
import com.packlink.hierachy.domain.primary.HierachyUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class Employee {
    private final HierachyUseCase useCase;

    @Autowired
    public Employee(HierachyUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping("/hierachy")
    public String create(@RequestBody Map<String, String> hierachy){
        return useCase.buildHierachy(hierachy);
    }
}
