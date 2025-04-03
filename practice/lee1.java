package practice;

import java.util.Scanner;

public class lee1 {  
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter the number: (1 ~ 4 only)");
      int number = input.nextInt();

      switch (number) {
        case 1:
        System.out.println("First");
        break;

        case 2:
        System.out.println("Second");
        break;

        case 3:
        System.out.println("Third");
        break;

        case 4:
        System.out.println("Fourth");
        break;

        default:
        System.out.println("Out of range");
      }
            
    
    }
}
      

        

      

    //   for (int i = 10; i >= limit; i -= 2) {
    //     System.out.print(i);
    //     if ( i -2 >= limit) {
    //         System.out.print(", ");
    //     }
    //   }

    //   do {
    //     System.out.print(startNum);
    //     if ( startNum / 2 >= 1) {
    //         System.out.print(", ");
    //     }
    //     startNum /= 2;
    //   } while ( startNum >= 1);
        

        
    

