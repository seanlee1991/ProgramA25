import java.util.Scanner;
public class w3Lab3 {
        public static void main(String[] args) {
            Scanner myInput = new Scanner(System.in);
    
            double num1 , num2; // Declare double
    
            double sum, diff, prod, quot, quot1, quot2, quot3; // Declare doubles

            System.out.println("Enter your num1: ");
            num1 = myInput.nextDouble();

            System.out.println("Enter your num2: ");
            num2 = myInput.nextDouble();
    
    
    
            sum = num1 + num2; // Addition
    
            diff = num1 - num2; // Subtraction
    
            prod = num1 * num2; // Multiplication
    
            quot = num1 / num2; // division
    
            quot1 = (double) num1 / num2; 
    
            quot2 = (double) num1 / (double) num2;
    
            quot3 = 1.0 * num1 / num2;
    
    
    
            // Output results
    
            System.out.println("Sum: " + sum);
    
            System.out.println("Difference: " + diff);
    
            System.out.println("Product: " + prod);
    
            System.out.println("Quotient: " + quot);
    
            System.out.println("Quotient: " + quot1);
    
            System.out.println("Quotient: " + quot2);
    
            System.out.println("Quotient: " + quot3);
    
            System.out.println("HI \n"+num1+ "\n"+num2);
    
    
    
        }
    
    }
    

