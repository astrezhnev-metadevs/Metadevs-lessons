package com.metadevs.oop;

public class ControlPanel {
    public static void main(String[] args) {
        Company vector = new Company("ООО Вектор");
        Person director = new Person("Игнатий Константинович", 56);
        Person chiefAccountant = new Person("Изольда Вениаминовна", 32);

        Manager vitaliy = new Manager();

        vector.addEmployee(director, 200);
        vector.addEmployee(chiefAccountant, 300);
        vector.fireEmployee(director.getName());
        vector.aboutCompany();
        vector.checkSalaryAndAge();
        vector.addEmployee(vitaliy, 500);
    }
}

