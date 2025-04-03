package week6;

import java.util.Arrays;
import java.util.Scanner;

public class lab22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] originalArray = {10,20,30,40,50};
        int [] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

        Arrays.sort(copiedArray);

        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print("Enter the value: ");
            int valueToSearch = input.nextInt();
            int returnIndex = Arrays.binarySearch(copiedArray, valueToSearch);

            //with an if-else statement. Anything less than 0 as a result of Arrays.binarySearch() means the value wasn’t found: 

            if ( returnIndex < 0) { 
                System.out.println("The value not FOUND.");

            
            } else {
                System.out.printf("The value %d is in %d index.\n", valueToSearch, returnIndex  );
                
            }
        }


















        // int [] arrayA = { 1,2,3,4,5};
        // int [] copiedArray = Arrays.copyOf(arrayA, arrayA.length);
        // Arrays.sort(copiedArray);

        // System.out.print("Enter the value: ");
        // int value = input.nextInt();

        // int returnIndex = Arrays.binarySearch(copiedArray, value);
        // System.out.println("Index of value searched is: " + returnIndex);




        
    }
    
}
