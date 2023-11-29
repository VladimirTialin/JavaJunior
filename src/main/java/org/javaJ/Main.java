package org.javaJ;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//1. Создать список из 1_000 рандомных чисел от 1 до 1_000_000
        List<Integer> list = Stream.generate(() ->
                        ThreadLocalRandom.current()
                                .nextInt(1, 1000000))
                .limit(1000).toList();

//1.1 Найти максимальное
        System.out.println("max: " + list.stream()
                .max(Integer::compare)
                .get());

//2.2 Все числа, большие, чем 500_000, умножить на 5, отнять от них 150 и просуммировать
        System.out.println("sum: " + list.stream()
                .filter(x -> x > 500000)
                .mapToInt(x -> x * 5 - 150).sum());

//2.3 Найти количество чисел, квадрат которых меньше, чем 100_000
     System.out.print("The number of numbers whose square is less than 100_000: "+
    list.stream().filter(x-> Math.pow(x,2)<100000).count());

//2. Создать класс Employee (Сотрудник) с полями: String name, int age, double salary, String department
//2.1 Создать список из 10-20 сотрудников
        List<Employee> employee = new Employee().generateEmployee();
//2.2 Вывести список всех различных отделов (department) по списку сотрудников
        System.out.println();
        employee.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
//  2.3 Всем сотрудникам, чья зарплата меньше 10_000, повысить зарплату на 20%
        System.out.println("Salary: ");
        employee.stream().filter(x ->x.getSalary()<10000)
                         .map(x ->x.getSalary()+x.getSalary()*0.20)
                         .forEach(System.out::println);
//2.4 * Из списка сотрудников с помощью стрима создать Map<String, List<Employee>> с отделами и сотрудниками внутри отдела
        Map<String, List<Employee>> dev=employee.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(dev);
//2.5 * Из списока сорудников с помощью стрима создать Map<String, Double> с отделами и средней зарплатой внутри отдела
        employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)))
                .forEach((x, y) -> System.out.println("В отделе "+x+" средняя зарплата ="+y));
    }

}