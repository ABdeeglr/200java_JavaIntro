package fty_AKA_face_to_yama;
import java.time.*;
// import java.lang.Object.*;

/**
 * This program tests the Employee class
 * @author ABdeeglr
 */


public class EmployeeTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee instance
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Max", 75000, 1987, 12, 15);
        staff[1] = new Employee("Jonathan Joestar", 68000, 1991, 3, 8);
        staff[2] = new Employee("London Wednesday", 77500, 1984, 6, 4);

        // raise everyone's money by 5%
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        // print out information about all Employee instance
        for (Employee e : staff) {
            System.out.printf("%s's salary is %f and his(her) hireday is %s.\n", 
            e.getName(), e.getSalary(), e.getHireDay());
        }
    }
}


class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    // Aka __init__
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    // Accessor Methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDay() {
        return  hireDay.toString();
    }

    // Mutator Methods
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
}