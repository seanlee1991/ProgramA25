package practice;

import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {

        Scanner InPut = new Scanner(System.in);
        
        System.out.println("What kind of colour do you pick?");
        String colour = InPut.nextLine();

        switch (colour) {
            case "blue":
                System.out.println("You have won");
                break;
            case "red":
                System.out.println("You come in second.");
                break;
            case "green":
                System.out.println("You come in third.");
                break;
            case "yellow":
                System.out.println("You come in fourth.");
                break;
            default:
                System.out.println("Better luck next time.");
        }

        
    }
}

        // 문자열 비교는 equals() 메서드 사용
        // if (colour.equals("blue")) {
        //     System.out.println("You have won");
        // } else if (colour.equals("red")) {
        //     System.out.println("You come in second.");
        // } else if (colour.equals("green")) {
        //     System.out.println("You come in third.");
        // } else if (colour.equals("yellow")) {
        //     System.out.println("You come in fourth.");
        // } else {
        //     System.out.println("Better luck next time.");
        // }   
        // }

    // }
    


