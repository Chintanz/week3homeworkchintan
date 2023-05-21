package javaprogramme;

import java.util.Scanner;

/**Write a Java program to test if an array contains a specific value*/
public class Programme20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = {55, 45, 69, 44};
        System.out.print("Enter a number to check if it is in the array: ");
        int num = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < myArray.length; i++) {
            if(num == myArray[i]) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("The array contains the given element.");
        } else {
            System.out.println("The array does not contain the given element.");
        }
    }
}
