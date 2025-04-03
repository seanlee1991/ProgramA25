package practice;
import java.util.Scanner;
public class lee3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 101);
        int num2 = (int)(Math.random() * 101);
        int result = num1 + num2;
        
        System.out.printf("what is the %d + %d? : ",num1 ,num2);
        
        int attempts = 3;

        while ( attempts > 0) {
            int userGuess = input.nextInt();


            if (userGuess == result) {
                System.out.println("You are correct!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {                
                System.out.printf("Wrong! you have %d chance left.%n", attempts);
                
                } else  {
                    System.out.printf("The right answer was %d.", result);
                }
        }

            


        }





    }
}
