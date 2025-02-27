import java.util.Scanner;

public class w3Lab1 {

public static void main(String[] args) {

Scanner myInput = new Scanner(System.in);

    //declare 4 memory boxes (variables)

    int num1, num2, num3, num4 , total;

    total= 0;

    //get input

    System.out.print("Enter 1st number: ");

    num1 = myInput.nextInt();

    total = total + num1;

    System.out.println("Running total: "+total);



    System.out.print("Enter 2nd number: ");



    num2 = myInput.nextInt();

    total = total + num2;

    System.out.println("Running total: "+total);



    System.out.print("Enter 3rd number: ");



    num3 = myInput.nextInt();

    total = total + num3;

    System.out.println("Running total: "+total);



    System.out.print("Enter 4th number: ");

    num4 = myInput.nextInt();

    total = total + num4;

    System.out.println("Running total: "+total);





    System.out.println("Sum of "+num1+", "+num2+", "+num3+", "+num4+", is "+total);

    
    }



}

/*Input:

Four numbers (num1, num2, num3, num4)

Process:

running_total = 0

running_total = running_total + num1

running_total = running_total + num2

running_total = running_total + num3

running_total = running_total + num4

Output:

Display running total after each addition

Display final total

 */
