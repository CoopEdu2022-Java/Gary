package twoone;

import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public int getYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }
}

public class H9 {
    public static void main(String[] args) {
        LocalDate hireDate = LocalDate.of(2018, 4, 15);
        Employee employee = new Employee("John Doe", 50000, hireDate);

        System.out.println("Employee: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDate());
        System.out.println("Years of Service: " + employee.getYearsOfService());
    }
}

