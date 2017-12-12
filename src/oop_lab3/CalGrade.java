package oop_lab3;


import java.util.Scanner;

public class CalGrade {
    public static void main (String [] args) {
        // 1. create object for }
        //  score 0-49 grade F
        //  score 50-59 grade D
        //  score 60-69 grade C
        //  score 70-79 grade B
        //  score 80-100 grade A

                // 1. create object for get input from user.
        Scanner scanner = new Scanner(System.in);
                // 2. create vriable for store data.
                int score;
                System.out.println("Enter your score: ");
                score = scanner.nextInt();
                // 3. test variable with condition above.
                // 4. show the output on screen.
                if (score <= 49) System.out.println("Your grade is F");
                else if (score <= 59) System.out.println("Your grade is D");
                else if (score <= 69) System.out.println("Your grade is C");
                else if (score <= 79) System.out.println("Your grade is B");
                else System.out.println("Your grade is A");
            }//main

    }//lass