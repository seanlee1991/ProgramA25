package week8;
import java.util.Scanner; 
public class practice {
    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);         
        System.out.print("Enter first number: ");         
        int val1 = input.nextInt(); 
        System.out.print("Enter second number: ");         
        int val2 = input.nextInt(); 
        //call the method and pass the two numbers         
        int total = sumOfNumbers(val1,val2); 
        //print the result returned by the method sum() 
        System.out.println("Sum of "+val1+" and "+val2+" is "+total); 
    }     
        public static int sumOfNumbers(int val1, int val2) {         
        int sum = val1 + val2;         
        return sum; 
    } 
} 

    

