package com.metadevs.oop;

public interface IdealCompany {
    public String getName();
    public Company name(String name);
    public void addEmployee(Worker worker, int salary);
    public void fireEmployee(String name);
    public void checkSalaryAndAge();
    public void aboutCompany();

}
