package javaprogramme;
/**Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 “ZERO”*/
import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println(num + " is POSITIVE");
        } else if (num < 0) {
            System.out.println(num + " is NEGATIVE");
        } else {
            System.out.println(num + " is ZERO");
        }
    }
}
