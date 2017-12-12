package oop_lab3;

import java.util.Scanner;

public class PIN {
    public static void main(String[] args) {
        String PIN = "1234",input;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter PIN: ");
            input = scanner.nextLine();
            if (PIN.equals(input)){
                System.out.println("Welcome.");
                break;
            }else {
                count++;
                if (count==3){
                    System.out.println("Locked.");
                    break;
                }
            }
        }while (count <=3);



    }//main

}//class
