package week8;

import java.util.Scanner;

public class exercise6 {

    public static void checkLogin(String username, String password) {
        boolean isRose = username.equals("Rose");
        boolean isViolet = username.equals("Violet");
        boolean correctPasswordForRose = isRose && password.equals("Red");
        boolean correctPasswordForViolet = isViolet && password.equals("Blue");

        if (correctPasswordForRose || correctPasswordForViolet) {
            System.out.println("Hello " + username + "! Access granted.");
        } else if (isRose || isViolet) {
            System.out.println("Hello " + username + ". Access suspended. Incorrect password.");
        } else {
            System.out.println("Warning! Unknown user. Access denied.");
        } 
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        checkLogin(username, password); 

        
        
    }
}