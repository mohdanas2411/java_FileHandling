package ques;

import java.util.Objects;

public class Employee {
    int id;
    String name;
    String date;
    double salary;

    public Employee(int id, String name, String date, double salary) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    public void setId(int id) {
       this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee)) return false;
//        Employee employee = (Employee) o;
//        return id == employee.id && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(date, employee.date);
//

        return true;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        return 10;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name, date, salary);
//    }
}
