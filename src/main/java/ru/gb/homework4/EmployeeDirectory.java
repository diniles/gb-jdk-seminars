package ru.gb.homework4;

import java.util.ArrayList;
import java.util.List;

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
     * Метод добавление нового сотрудника в справочник
     */
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int employeeId) {
        Employee employee = getEmployeeById(employeeId);
        if (employee != null) {
            employees.remove(employee);
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

    public List<Employee> geAllEmployees() {
        return employees;
    }
}
