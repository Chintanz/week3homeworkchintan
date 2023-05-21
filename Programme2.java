package javaprogramme;

import java.util.Scanner;

/**Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?*/
public class Programme2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a year");
        int year = Integer.parseInt(sc.nextLine());
        if (year % 400 == 0 && year % 100 == 0 && year % 4 == 0){
            System.out.println("This year is a leap year");
        } else
        if (year % 4 == 0 && year%100!=0){
            System.out.println("The year is a leap year");
        } else
        {
            System.out.println("The year is not a leap year");
        }

    }
}

