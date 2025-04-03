package week8;

public class practice2 {
    
        public static void main(String[] args) {
            printWelcomeMessage();
    
            processStudentScores(1, 85, 90, 78);
            processStudentScores(2, 76, 82, 91);
            processStudentScores(3, 88, 79, 85);
        }
    
        // 1. 시작 메시지를 출력하는 메서드
        public static void printWelcomeMessage() {
            System.out.println("Welcome to the Student Score Calculator!");
            System.out.println("----------------------------------------");
        }
    
        // 2. 학생 점수를 처리하는 메서드
        public static void processStudentScores(int studentNumber, int score1, int score2, int score3) {
            int total = calculateTotal(score1, score2, score3);
            double average = calculateAverage(total, 3);
    
            System.out.println("Student " + studentNumber + " Scores: " + score1 + ", " + score2 + ", " + score3);
            System.out.println("Total: " + total + ", Average: " + average);
            System.out.println("----------------------------------------");
        }
    
        // 3. 총점을 계산하는 메서드
        public static int calculateTotal(int score1, int score2, int score3) {
            return score1 + score2 + score3;
        }
    
        // 4. 평균을 계산하는 메서드
        public static double calculateAverage(int total, int numSubjects) {
            return total / (double) numSubjects;
        }
    }
    

