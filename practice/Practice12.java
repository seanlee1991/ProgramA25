package practice;

import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {

        Scanner InPut = new Scanner(System.in);

        System.out.print("Enter the limit for the sequence: ");
        int limitNum = InPut.nextInt();

        int i = 1; // Start of the sequence

        System.out.print("Sequence: ");

        // While loop to print the sequence
        while (i <= limitNum) {
            System.out.print(i);
            if (i + 3 <= limitNum) {  // Prevents printing ',' after the last number
                System.out.print(", ");
            }
            i += 3; // Increase by 3
        }

        
    }

    //     System.out.print("Sequence: ");

    //     for (int i = 1; i <= limitNum; i = i + 3) {
    //         System.out.print(i);
    //         if (i + 3 <= limitNum) {
    //             System.out.print(", ");
    //         }
    //     }
    // }  

}
