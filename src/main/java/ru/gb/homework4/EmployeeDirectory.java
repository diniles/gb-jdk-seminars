package ru.gb.homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class EmployeeDirectory {
    private final List<Employee> employees;

    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    /**
     * Метод, который ищет сотрудника по стажу (может быть список)
     */
    public List<Employee> getEmployeeByExperience(int experience) {
        List<Employee> employeesByExperience = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                employeesByExperience.add(employee);
            }
        }
        return employeesByExperience;
    }

    /**
     * Метод, который выводит номер телефона сотрудника по имени (может быть список)
     */
    public void printEmployeePhoneByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                System.out.println(employee.getPhoneNumber());
            }

        }
    }

    /**
     * Метод, который ищет сотрудника по табельному номеру
     */
    public Employee getEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Метод добавление нового сотрудника в справочник
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void forEach(Consumer<Employee> action) {
        employees.forEach(action);
    }
}
