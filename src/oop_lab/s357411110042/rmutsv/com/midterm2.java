package oop_lab.s357411110042.rmutsv.com;

import java.util.Scanner;

public class midterm2 {
    public static void main(String[] args) {
        String getName;
        int getID;
        int getSalary = 0;
        int net = 0;
        int salarynet = 0;
        int getOverTime = 0;

        Scanner oj = new Scanner(System.in);
        System.out.print("\nรหัสพนักงาน: ");
        getID = oj.nextInt();

        Scanner Keyboard = new Scanner(System.in);
        System.out.print("\nชื่อพนักงาน: ");
        getName = Keyboard.nextLine();

        System.out.print("\nเงินเดือนพนักงาน: ");
        getSalary = oj.nextInt();

        System.out.print("\nค่าล่วงเวลา: ");
        getOverTime = oj.nextInt();

        if (getSalary+getOverTime >= 100000) {
            net = (getSalary + getOverTime);
            System.out.println("\nเสียภาษี: 10%");
            System.out.println("\nเงินเดือนสุทธิ: " + net);
            System.out.println("\nภาษี:" + net*10/100);
        } else if ((getSalary+getOverTime >= 70000)&&(getSalary+getSalary <= 99999)) {
            net = (getSalary + getOverTime);
            System.out.println("\nเสียภาษี: 7%");
            System.out.println("\nเงินเดือนสุทธิ: " + net);
            System.out.println("\nภาษี:" + net*7/100);
        } else if ((getSalary+getOverTime >= 50000)&&(getSalary+getSalary <= 69999)) {
            net = (getSalary + getOverTime);
            System.out.println("\nเสียภาษี: 5%");
            System.out.println("\nเงินเดือนสุทธิ: " + net);
            System.out.println("\nภาษี:" + net*5/100);
        }else if ((getSalary+getOverTime >= 30000)&&(getSalary+getOverTime <= 49999)) {
            net = (getSalary + getOverTime);
            System.out.println("\nเสียภาษี: 3%");
            System.out.println("\nเงินเดือนสุทธิ: " + net);
            System.out.println("\nภาษีที่ต้องเสีย:" + net*3/100);
        }
        else if (getSalary+getOverTime < 29999){
            net = (getSalary + getOverTime);
            System.out.println("\nเสียภาษี:1%");
            System.out.println("\nเงินเดือนสุทธิ: "+ net);
            System.out.println("\nภาษีที่ต้องเสีย:" +net*1/100);
        }
    }
}



