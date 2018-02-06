package oop_lab9;

public class Person {
    private String personID;
    private String name;
    private Address address;
    private Job job;

    public Person(String personID, String name, Address address, Job job) {
        this.personID = personID;
        this.name = name;
        this.address = address;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    public String getPersonID() {
        return personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}