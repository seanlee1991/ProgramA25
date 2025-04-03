package week4;

public class w4Lab2 {
            public static void main(String[] args) {
    
            int testscore = 99;
            char grade;
            
    
            if (testscore >= 90) {
                grade = 'A';
                if (testscore >= 95) {
                    System.out.println("great job!");
                }
            } else if (testscore >= 80) {
                grade = 'B';
            } else if (testscore >= 70) {
                grade = 'C';
            } else if (testscore >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Grade = " + grade);
        }
    }