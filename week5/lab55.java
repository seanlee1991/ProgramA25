package week5;

import java.util.Scanner;

public class lab55 {
    public static void main(String[] args) {
        
        Scanner InPut = new Scanner(System.in);

        

        System.out.println("Enter total number of students in the class.");
        int totalStudents = InPut.nextInt();
        int highestGrade =0 ,  currentStudent =0;

        for (int i = 1; i <= totalStudents; i++ ) {
            System.out.printf("%nCurrent Student's number: %d", i);
            System.out.printf("%nEnter current student no. %d's grade please: ", i);
            int grade = InPut.nextInt();

            if (grade > highestGrade) {
                highestGrade = grade;
                currentStudent = i;

            }
           
        }
        System.out.printf("Student number: %d has gor the highest grade of: %d", currentStudent, highestGrade); 
        
        
    }
}


       

    

