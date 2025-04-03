package practice;

import java.util.Scanner;
public class Practice14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ranNum1 = (int)(Math.random()*101);
        int ranNum2 = (int)(Math.random()*101);
        int attempts = 3;
        int correctAnswer = ranNum1 + ranNum2;

        System.out.printf("What is %d + %d = ?%n", ranNum1, ranNum2);

        while ( attempts > 0) {
            System.out.println("Enter your number: ");
            int userAnswer = input.nextInt();
            
            if ( userAnswer == correctAnswer) {
                System.out.println("Your are correct!");
                break;
            } else {
                attempts--;
                if ( attempts > 0) {
                    System.out.printf("Try it again. (You have %d attempts left.)%n", attempts);
                } else {
                    System.out.printf("Your wrong. The correct answer was %d%n", correctAnswer);
                }
                
            }

            }
        }
        
    }

