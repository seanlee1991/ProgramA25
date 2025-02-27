import java.util.Scanner;

public class w3Lab2 {

public static void main(String[] args) {

Scanner myInput = new Scanner(System.in);

String name1, name2, name3, name4, name5;
    int age1, age2, age3, age4, age5;

    System.out.println("Enter your name: ");
    name1 = myInput.nextLine();
    System.out.print("Enter your name: ");
    name2 = myInput.nextLine();
    System.out.print("Enter your name: ");
    name3 = myInput.nextLine();
    System.out.print("Enter your name: ");
    name4 = myInput.nextLine();
    System.out.print("Enter your name: ");
    name5 = myInput.nextLine();

    System.out.print("Enter your age: ");
    age1 = myInput.nextInt();
    System.out.print("Enter your age: ");
    age2 = myInput.nextInt();
    System.out.print("Enter your age: ");
    age3 = myInput.nextInt();
    System.out.print("Enter your age: ");
    age4 = myInput.nextInt();
    System.out.print("Enter your age: ");
    age5 = myInput.nextInt();

    System.out.println(name1 +" " + age1 + ","+ name2 +" " + age2 + "," +name3 +" " + age3 + "," +name4 +" " + age4 +"," +name5 +" " + age5 + ".");



    
}
}
