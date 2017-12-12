package oop_lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSwitchCase {
    public static void main(String[] args) throws IOException {
        // switch-case
        BufferedReader reader = new BufferedReader(
           new InputStreamReader(System.in));
        int input;
        System.out.print("Plese enter number (1-3) : ");
        input = Integer.parseInt(reader.readLine());
        switch (input) {
            case 1:
                System.out.println("Your entered 1.");
                break;
            case 2:
                System.out.println("Your entered 2.");
                break;
            case 3:
                System.out.println("Your entered 3.");
                break;
            default:
                System.out.println("Please enter number 1-3.");

        }//switch
    }//main
}//lass
