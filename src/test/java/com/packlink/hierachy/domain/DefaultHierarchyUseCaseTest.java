package com.packlink.hierachy.domain;

import com.packlink.hierachy.domain.repositories.EmployeeSupervisorRepository;
import com.packlink.hierachy.infrastructure.entity.EmployeeSupervisorEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DefaultHierarchyUseCaseTest {

    DefaultHierarchyUseCase useCase = new DefaultHierarchyUseCase();
    @Mock
    EmployeeSupervisorRepository repository;

    @Test
    public void emptyHierarchy() {
        List<EmployeeSupervisor> input = Collections.emptyList();

        assertEquals(useCase.getHierarchy(input, repository), Collections.emptyList());
    }

    @Test
    public void onePairOfEmployeeSupervisor() {
        EmployeeSupervisorEntity employeeSupervisorEntity = new EmployeeSupervisorEntity("Pepe", "Antonio");
        when(repository.save(employeeSupervisorEntity)).thenReturn(employeeSupervisorEntity);

        List<EmployeeSupervisor> input = Arrays.asList(new EmployeeSupervisor("Pepe", "Antonio"));
        Hierarchy finalHierarchy = new Hierarchy("Antonio", Arrays.asList(new Hierarchy("Pepe", Collections.emptyList())));

        List<Hierarchy> result = useCase.getHierarchy(input, repository);
        assertEquals(result, Arrays.asList(finalHierarchy));
//        verify(repository).save(employeeSupervisorEntity);
    }

    @Test
    public void testingEquals() {
        Hierarchy hierarchy3 = new Hierarchy("Susi", Arrays.asList(new Hierarchy("Tere", Collections.emptyList())));
        Hierarchy hierarchy1 = new Hierarchy("Antonio", Arrays.asList(new Hierarchy("Pepe", Collections.emptyList()), hierarchy3));
        Hierarchy hierarchy2 = new Hierarchy("Antonio", Arrays.asList(new Hierarchy("Pepe", Collections.emptyList()), hierarchy3));
        assertEquals(hierarchy1, hierarchy2);
    }

}
