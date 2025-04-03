package practice;

import java.util.Scanner;

public class Pracrice13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 사용자에게 숫자 입력 요청
        System.out.print("Enter a number for the multiplication table: ");
        int number = input.nextInt();

        // 곱셈표 생성
        int i = 1;
        while (i <= 10) {
            int result = number * i;
            if (result == 21 || result == 32) {
                System.out.println("You have triggered a forbidden number!");
                break;
            }
            System.out.printf("%d X %d = %d%n", number, i, result);
            i++;
        }
            
        }
    }



    

