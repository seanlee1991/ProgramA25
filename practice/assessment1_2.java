package practice;

import java.util.Scanner;
// Sanggyun Lee s4054367
public class assessment1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = (int)(Math.random() * 21);
        
        int i = 1;

        while (i > 0) {
            System.out.printf("what is the number you guess?: ", num);
            int userGuess = input.nextInt();
            if (userGuess == num) {
                System.out.println("You are correct");
                break;             
            } else {
                if (userGuess > num) {
                    System.out.println("Your asnswer is higher. try again!"); 
                } else if (userGuess < num) {
                    System.out.println("Your answer is lower. try again!");
                }
            }
            i++;
        }
    }
}
