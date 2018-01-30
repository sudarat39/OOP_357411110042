package oop_lab7;
//Talking about Student?
// 1.Student ID
// 2.Major
// 3.Faculty
// 4.Name


import java.lang.reflect.MalformedParametersException;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }//toString

    public static String gender = "Male";
    private String id;
    private String major;
    private String faculty;
    private String name;
    //Constructor
    //Default constructor
    public Student(){}
    //create constructor by owner
    public Student(String id,String m,String f,String n){
        //assign data to class properties
        this.id = id;
        this.faculty = f;
        this.major = m;
        this.name = n;
    }
    //getter and setter methods


    public String getId() {
        return id;
    }//getId

    public void setId(String id) {
        this.id = id;
    }//setId

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}//class