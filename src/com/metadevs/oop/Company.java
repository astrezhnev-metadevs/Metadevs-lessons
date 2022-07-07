package com.metadevs.oop;

import java.util.ArrayList;

public class Company implements IdealCompany {

    private String name;
    private ArrayList <Worker> workers;

    public Company(String name){
        this.name = name;
        workers = new ArrayList<Worker>();
    }

    public String getName() {
        return name;
    }

    @Override
    public Company name(String name) {
        return null;
    }

    public void addEmployee(Worker worker, int salary) {
        workers.add(worker);
        worker.setSalary(salary);
        worker.setCompanyName(name);
    }

    public void fireEmployee(String name) {
        for (int i = 0; i < workers.size(); i++) {
            if (workers.get(i).getName() == name) {
                workers.remove(i);
            }
        }
    }

    public void checkSalaryAndAge() {
        for (int i = 0; i < workers.size(); i++) {
            workers.get(i).checkDifference();
        }
    }

    public void aboutCompany() {
        System.out.println(name);
        for (int i = 0; i < workers.size(); i++) {
            System.out.println(workers.get(i));
            workers.get(i).aboutPerson();
        }
    }
}
