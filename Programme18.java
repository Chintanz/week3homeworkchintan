package javaprogramme;

import java.util.Arrays;

/**Write a Java program to sum values of an array.*/
public class Programme18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of array elements is: " + sum);
    }
}
