// V.	Highest score: 
// Create an algorithm and code the following program: 
// Create a program that identifies the highest numerical grade entered from a class of students. The number of total students in the class should be entered by the user. 
// Using a for-loop, the user should be prompted to enter a grade for each student individually. Each student’s number will be identified using a count. 
// Finally display the student’s number with the highest score. 
package practice;

import java.util.Scanner;

public class lee4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total of students number: ");
        int totalStudents = input.nextInt();
        int highestGrade = 0;
        int currentStudent = 0;

        for (int i = 1; i <= totalStudents; i++ ) {
            System.out.printf("Current Student's number: %d%n", i);
            System.out.printf("Enter current student no. %d's grade please: ", i);
            int grade = input.nextInt();

            if (grade > highestGrade) {
                highestGrade = grade;
                currentStudent = i;

            }
           
        }
        System.out.printf("Student number: %d has got the highest grade of: %d", currentStudent, highestGrade); 
        

        // int i = 1; // 초기화: 첫 번째 학생부터 시작
        // while (i <= totalStudents) {
        //     System.out.printf("Current Student's number: %d%n", i);
        //     System.out.printf("Enter current student no. %d's grade please: ", i);
        //     int grade = input.nextInt();

        //     if (grade > highestGrade) {
        //         highestGrade = grade;
        //         currentStudent = i;
        //     }

        //     i++; // 다음 학생으로 이동
        // }

        // System.out.printf("Student number: %d has got the highest grade of: %d", currentStudent, highestGrade);
    

            

        }
        




    }


