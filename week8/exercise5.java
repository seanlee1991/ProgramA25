package week8;


import java.util.Scanner;

public class exercise5 {

        public static boolean isVip() {
            Scanner input = new Scanner(System.in);
            System.out.println("Are you VIP member? If you are VIP please enter 'Y': ");
            String vip_input = input.nextLine();
            
            Boolean vip = false;

            vip_input = vip_input.toLowerCase();

            if (vip_input.equals("y")) {
                vip = true;
            }

            return vip;
        }
        
        public static boolean isGoldClassSeat() {
            Scanner input = new Scanner(System.in);
            System.out.println("Do you choose the Gold class seat? If you are please enter 'Y': ");
            String goldclass_input = input.nextLine();
            
            Boolean goldclass = false;
            goldclass_input = goldclass_input.toLowerCase();

            if (goldclass_input.equals("y")) {
                goldclass = true;
            }

            return goldclass;

            
        }
                

        public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your mobile number: ");
        int mobileNumber = input.nextInt();
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter the movie name: ");
        String movieName = input.next();
        System.out.println("Enter the movie time: ");
        String movieTime = input.next();
        
        double ticketPrice = 20;

        if ( age < 18) {
            ticketPrice = ticketPrice / 2;            
        } else if ( age > 65) {
            ticketPrice = ticketPrice * 3/4;
        }
        
        boolean vip_result = isVip();

        if (vip_result == true) {
            ticketPrice = ticketPrice * 0.8;
        }

        boolean goldclass_result = isGoldClassSeat();

        if (goldclass_result == true) {
            ticketPrice = ticketPrice * 1.5; 
        }

        System.out.println("Name: " + name);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Age: " + age);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Movie Time: " + movieTime);
        System.out.println("The ticket price is: " + ticketPrice);
        
    }    
    
}