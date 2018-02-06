package oop_lab9;

public class myPersonApp {
    public static void main(String[] args) {

        Person person = new Person("2222222222222",
                "Sudarat Kunlasing",
                new Address("62 M.12",
                        "Nakornsithammarat",
                        "80110"),
                new Job("Student",2500));

        System.out.println(person.toString());

        person.getJob().setSalary(2500);

        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostCode());





    }
}