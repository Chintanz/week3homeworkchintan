package javaprogramme;
/**Same as above program-8 using switch statement.*/
 import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an alphabet from a to f: ");
        char alphabet = input.next().charAt(0);
        String city;
        switch (alphabet) {
            case 'a':
                city = "Amsterdam";
                break;
            case 'b':
                city = "Berlin";
                break;
            case 'c':
                city = "Copenhagen";
                break;
            case 'd':
                city = "Dublin";
                break;
            case 'e':
                city = "Edinburgh";
                break;
            case 'f':
                city = "Frankfurt";
                break;
            default:
                System.out.println("Invalid entry");
                return;
        }
        System.out.println("The city name is " + city);
    }
        }