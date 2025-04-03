package week6;

import java.util.Arrays;
import java.util.Scanner; 
public class exam1 { 
    public static void main(String[] args) {         
        Scanner myInput = new Scanner(System.in); 
        String [ ] studentNames = new String[4]; 


        System.out.println(Arrays.toString(studentNames));


             for(int i =0; i < studentNames.length; i++)  { 
             System.out.println("Please enter student name: ");             
             studentNames[i] = myInput.nextLine(); 
     



         }  
             System.out.println(Arrays.toString(studentNames));

         for(int i =0; i < studentNames.length; i++)  { 
             System.out.printf("Student %d: %s\n", i+1, studentNames[i]); 
         } 
        // for each student in the studentNames array.
         for(String student: studentNames) {
             System.out.println(student);
         }
    } 
} 
