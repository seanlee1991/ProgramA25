package week4;
import java.util.Scanner;

public class w4Lab1 {
    public static void main(String[] args) {
    
     /*

        Assign two numbers to integer variables value1 and value2. Create a java program that always prints

the greater of the two numbers. Which variables value is printed if both the values are the same?

         * IPO Chart:

         * 

         * INPUT:

         * 

         * 

         * PROCESS:

         * 1. Declare values of value1 and value2.

         * 2. Compare the values:

         *    a. If value1 > value2, print value1.

         *    b. Else if value2 > value1, print value2.

         *    c. Else, print "Both numbers are equal."

         * 

         * OUTPUT:

         * - The greater number is displayed, or a message stating both numbers are equal.

         */
        Scanner InPut = new Scanner(System.in);



         int value1;
         int value2;

         System.out.println("Enter the first number: ");
         value1 = InPut.nextInt();
         System.out.println("Enter the second10 number: ");
         value2 = InPut.nextInt();



            if (value1 > value2) {

                System.out.println(value1);

            } else if (value2 > value1) {

                System.out.println(value2);

            } else {

                System.out.println("Both numbers are equal.");

            }


}
    
}
