package javaprogramme;
/**Write a java program input sales id, seller's name, sales amount, and salary basic and
 then fined this sales Commission*/
import java.util.Scanner;

public class Programme7 {
    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter amount:");

        double amount=sc.nextDouble();

        System.out.print("Enter commissionPercentage:");

        double commissionPercentage=sc.nextDouble();

        double commission=(commissionPercentage/100)*amount;

        System.out.println("Commission amount="+commission);

    }
}

