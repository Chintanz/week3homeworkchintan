package javaprogramme;

import java.util.Scanner;

/**Write a java program to input student Name, roll No, and three subjects Math, Science and
 English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 Input, Marks should between 0 to 100”) and find out total, percentage and result.
 If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
public class Programme3 {

    public static void main(String[] args) {
        int n,rollno, total=0, percentage, result;
        Scanner sc = new Scanner(System.in);
        System.out.println      ("-------------------------------");
        System.out.println      ("|       Mark Sheet             |");
        System.out.println      ("|______________________________|");
        System.out.println      ("|    Name      :        Jay    |");
        System.out.println      ("|    Roll No   08              |");
        System.out.println      ("|______________________________|");
        System.out.println      ("|    Subjects   :       Marks  |");
        System.out.println      ("|______________________________|");
        System.out.println      ("|   Maths      :      98       |");
        System.out.println      ("|   Science:     90            |");
        System.out.println      ("|   English:     85            |");
        System.out.println      ("|______________________________|");
        System.out.println      ("|   Total        :         273 |");
        System.out.println      ("|______________________________|");
        System.out.println      ("|   Percntage    :        91.0 |");
        System.out.println      ("|   Result       :        Pass |");
        System.out.println      ("|   Grade        :        A+   |");
        System.out.println      ("_______________________________|");

        rollno = sc.nextInt();

        System.out.println("Enter no. of subject : ");
        n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100 : ");
        for (int i = 0; i<n; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("The total mark : " + total);
        System.out.println("The percentage : " + percentage);

        if(percentage >=80){
            System.out.println("Grade : A+");
        }
        else if(percentage>=60){
            System.out.println("Grade : A");
        }
        else if(percentage>=50){
            System.out.println("Grade : B");
        }
        else if(percentage>=35){
            System.out.println("Grade : C");
        }
        else {
            System.out.println("Fail");
        }
    }

}
