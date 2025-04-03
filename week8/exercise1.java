package week8;

import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        int total = sumOfNumbers(num1,num2,num3);
        System.out.println("Sum of " + num1 + " + " + num2 + " + " + num3 + " = " + total);
    }


    public static int sumOfNumbers(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return num1+num2+num3;
    }
    
  }




