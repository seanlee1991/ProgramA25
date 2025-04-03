package practice;
import java.util.Scanner;
public class lee2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int i = 1;
        int multiplier = num * i;

        while (i <= 10) {
            
            if ( num == 21 || num == 32) {
                System.out.println("they have triggered a forbidden number.");
                break;
            }
            System.out.printf("%d X %d = %d%n", num, i, multiplier);
            
            i++;
        }




    }
    
}
