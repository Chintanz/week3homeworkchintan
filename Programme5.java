package javaprogramme;

import java.util.Scanner;

/** WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF*/

public class Programme5 {
    public String employeid;
    public String empname;
    public int basicsalary,HRA,TA,DA,PF,grosssalary;
    public void read()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the employee id");//taking all the inputs from the user
        employeid=scan.next();
        System.out.println("Enter the employee name");
        empname=scan.next();
        System.out.println("Enter the basic salary of an employee");
        basicsalary=scan.nextInt();
        calculate();
    }
    public void calculate()  //calculating all the parameters
    {
        HRA=(10/100)*basicsalary;
        TA=(9/100)*basicsalary;
        DA=basicsalary+TA+HRA;
        PF=(20/100)*DA;
        grosssalary=basicsalary + HRA + TA + DA - PF;

    }
    public void display()  //displaying the calculating parameters
    {
        System.out.println("Employeeid  :  "+employeid+"n"+"Employename  :  "+empname+"n"+"Employee basic salary :  " +
       ""+basicsalary+"n"+"HRA  :  "+HRA+"n"+"DA  :  "+DA+"n"+"DA  :  "+DA+"n"+"PF  :  " +
       ""+PF+"n"+"grosssalary  :  "+grosssalary);
    }


    public static void main(String args[]){
        Programme5 employeobj=new Programme5();
        employeobj.read();
        employeobj.display();
    }}



