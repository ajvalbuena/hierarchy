package com.packlink.hierachy.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Hierarchy {

    private final String boss;

    private final List<Hierarchy> employees;

    public Hierarchy(String boss, List<Hierarchy> employees) {
        this.boss = boss;
        this.employees = employees;
    }


    public String getBoss() {
        return boss;
    }

    public List<Hierarchy> getEmployees() {
        return employees;
    }


    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hierarchy))
            return false;
        Hierarchy other = (Hierarchy) o;
        boolean bossEquals = (this.boss == null && other.boss == null)
                || (this.boss != null && this.boss.equals(other.boss));
        boolean employeesEquals = (this.employees.isEmpty() && other.employees.isEmpty())
                || (!this.employees.isEmpty() && this.employees.equals(other.employees));
        return employeesEquals && bossEquals;
    }



}
