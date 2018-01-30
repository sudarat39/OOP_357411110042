package oop_lab8;

public class PersonInfo {
    public static void main(String[] args) {
        Student student = new Student(
                "1111111111111",
                "Boy Saiyai",
                "Male",
                20,
                "222222222222",
                "IS:Management Technology");
        System.out.println(student.toString());

        System.out.println(student.getName());

        Employee employee = new Employee("3333333333333",
                "Girl Saiyai",
                "Female",
                25,
                "EMP001",
                "Programmer", 50000);
        System.out.println(employee.toString());







    }//main
}//class
