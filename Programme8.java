package javaprogramme;
/**Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 //any other alphabet should be invalid entry*/
import java.util.Scanner;
public class Programme8 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an alphabet from A to F: ");
            char alphabet = input.next().charAt(0);
            if (alphabet == 'A') {
                System.out.println("City name: Ahmedabad");
            } else if (alphabet == 'B') {
                System.out.println("City name: Bangalore");
            } else if (alphabet == 'C') {
                System.out.println("City name: Chennai");
            } else if (alphabet == 'D') {
                System.out.println("City name: Delhi");
            } else if (alphabet == 'E') {
                System.out.println("City name: Ernakulam");
            } else if (alphabet == 'F') {
                System.out.println("City name: Faridabad");
            } else {
                System.out.println("Invalid entry!");
            }
        }
    }

