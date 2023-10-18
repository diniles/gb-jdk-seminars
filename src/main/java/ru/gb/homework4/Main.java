package ru.gb.homework4;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.addEmployee(new Employee("123-456-7890", "John", 5));
        employeeDirectory.addEmployee(new Employee("123-456-7891", "James", 3));
        employeeDirectory.addEmployee(new Employee("123-456-7892", "Mary", 7));
        employeeDirectory.addEmployee(new Employee("123-456-7893", "Justin", 3));
        employeeDirectory.addEmployee(new Employee("123-456-7894", "John", 5));

        List<Employee> employeesWithExperience = employeeDirectory.getEmployeeByExperience(3);
        System.out.println("Employees with experience = 3");
        for (Employee employee : employeesWithExperience) {
            System.out.println(employee);
        }

        System.out.println("All John's phone numbers");
        employeeDirectory.printEmployeePhoneByName("John");
    }

}
