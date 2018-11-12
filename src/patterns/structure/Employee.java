package patterns.structure;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    String dept;
    int salary;
    List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept= dept;
        this.salary = salary;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    }

    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee [ name: " + name + ", dept: " + dept + ", salary: " + salary + "]";
    }
}
