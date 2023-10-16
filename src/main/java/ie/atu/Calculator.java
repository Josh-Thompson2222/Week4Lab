package ie.atu;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)
    {
        System.out.println("Let's Finish early");
        add();
        delete();
        division();
    }


    public static void add()
    {
    System.out.println("Please enter your first number : ");
    Scanner inputs = new Scanner(System.in);
    int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number : ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total added together is " + total);
    }

    public static void delete()
    {
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number : ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total subtracted is " + total);
    }

    public static void division()
    {
        System.out.println("Please enter your first number : ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number : ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total divided is " + total);
    }

}
