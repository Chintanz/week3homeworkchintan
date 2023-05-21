package javaprogramme;

import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false. A year is a leap year if it is divisible by 4 but not by 100,
 * or it is divisible by 400.
 */

public class Programme4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        isLeapYear(year);
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            System.out.println("Invalid Value");
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("It is a Leap Year");
            return true;
        } else {
            System.out.println("It is not a Leap Year");
            return false;
        }
    }}
