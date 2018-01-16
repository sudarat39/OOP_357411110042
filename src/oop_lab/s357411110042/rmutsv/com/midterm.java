package oop_lab.s357411110042.rmutsv.com;

import java.util.Scanner;

public class midterm{

    private static final int x=2561;
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 3; ){
            Scanner scanner = new Scanner(System.in);
            System.out.print("กรุณาใส่ปี พ.ศ. เกิดของคุณ: ");
            int y = scanner.nextInt();
            System.out.println("อายุของคุณคือ: "+(x-y));
            i++;
        }
    }
}