package com.packlink.hierachy.infrastructure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeSupervisorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String employee;
    private String supervisor;

    public EmployeeSupervisorEntity(String employee, String supervisor) {
        this.employee = employee;
        this.supervisor = supervisor;
    }

    public EmployeeSupervisorEntity() {

    }

    public Long getId() {
        return id;
    }

    public String getEmployee() {
        return employee;
    }

    public String getSupervisor() {
        return supervisor;
    }
}

