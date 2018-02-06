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
}