package com.packlink.hierachy;

import com.packlink.hierachy.domain.repositories.EmployeeSupervisorRepository;
import com.packlink.hierachy.infrastructure.entity.EmployeeSupervisorEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RepositoryIT {

    @Autowired
    private EmployeeSupervisorRepository repository;

    @Test
    public void givenEmployeeSupervisorRepository_whenSaveAndRetrieveEntity_thenOK() {
        EmployeeSupervisorEntity employeeSupervisorEntity = repository.save(new EmployeeSupervisorEntity("Manolo", "Teresa"));
        Optional<EmployeeSupervisorEntity> foundEntity = repository.findById(employeeSupervisorEntity.getId());

        assertNotNull(foundEntity);
        assertEquals(employeeSupervisorEntity.getEmployee(), foundEntity.get().getEmployee());
    }
}