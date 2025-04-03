package week8;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the product name: ");
        String name = input.nextLine();

        System.out.print("Type the price: ");
        int price = input.nextInt();

        double gst = gstCalculator(price);  
        double total = price + gst;

        System.out.println("Cost of " + name + " is: " + total + " (including GST: " + gst + ")");
    }

    
    public static double gstCalculator(double cost) {
        double gst = cost * 0.1;
        return gst; 
    }
}



