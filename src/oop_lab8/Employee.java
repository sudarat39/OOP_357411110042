package oop_lab8;

public class Employee extends Person {
    private String employeeID;
    private String position;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }

    public Employee(String personID, String name,
                    String gender, int age,
                    String employeeID, String position,
                    double salary) {
        super(personID, name, gender, age);
        this.employeeID = employeeID;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}