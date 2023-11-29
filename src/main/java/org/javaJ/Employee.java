package org.javaJ;

import java.util.List;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private String department;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }
    public Employee(){

    };
    public List<Employee> generateEmployee() {

        return List.of(
                new Employee("Иван",25,16000,"developer"),
                new Employee("Сергей",20,17300,"developer"),
                new Employee("Петр",30,12000,"tester"),
                new Employee("Светлана",35,13000,"developer"),
                new Employee("Артем",18,17500,"developer"),
                new Employee("Димтрий",27,20000,"tester"),
                new Employee("Анастасия",43,4500, "cleaner"),
                new Employee("Дарья",42,22400,"developer"),
                new Employee("Владимир",20,18700,"developer"),
                new Employee("Виктор",33,17900,"developer"),
                new Employee("Ян",34,16000,"tester"),
                new Employee("Алексей",36,8300,"administrator"),
                new Employee("Андрей",50,30000,"director"),
                new Employee("Константин",22,2700,"cleaner"),
                new Employee("Михаил",27,13500,"tester"),
                new Employee("Евгений",25,16000,"developer"),
                new Employee("Антон",29,19900,"tester"),
                new Employee("Марья",27,9500,"administrator"),
                new Employee("Александр",20,17900,"developer"),
                new Employee("Игнат",42,9800,"administrator"),
                new Employee("Василий",43,18800,"developer")
        );
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "\nEmployee[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                "]\n";
    }
}
