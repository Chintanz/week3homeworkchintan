package javaprogramme;
/**Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)*/
 import java.util.Scanner;

public class Programme1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);

    }
}
