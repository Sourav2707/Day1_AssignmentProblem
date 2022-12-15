package com.uc7_leap_year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the year after 1582");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("The year "+year+" is a leap year");
        }
        else
            System.out.println("The year "+year+" is not a leap year");
    }
}
