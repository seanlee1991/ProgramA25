package week6;


import java.util.Scanner;


public class lab33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int [] ages = new int [3];
        String [] names = new String [3];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age: ");
            ages[i] = input.nextInt();
            System.out.print("Enter the name: ");
            names[i] = input.next();  
            }
            
            for (int i = 0; i < ages.length; i++) {
                System.out.printf("%s are %d years old.\n", names[i], ages[i]);
                
            }



    }
    
}
