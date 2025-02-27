import java.util.Scanner;
public class Data1 {
        public static void main(String[] args) {
            Scanner myInput = new Scanner(System.in);

            String day, month, firstName, lastName, fullName;
            int date, year;

            System.out.print("Enter the day: ");
            day = myInput.nextLine();
            System.out.print("Enter the month: ");
            month = myInput.nextLine();

            System.out.print("Enter the date: ");
            date = myInput.nextInt();
            System.out.print("Enter the year: ");
            year = myInput.nextInt();

            System.out.println("Enter your firstname: ");
            firstName = myInput.next();
            System.out.print("Enter your lastname: ");
            lastName = myInput.next();

            fullName = firstName + " " + lastName;

            System.out.println("Hello, my name is " + fullName + ".");



            System.out.println("Display variables in American format (" + day + "," + month + "," + date + "," + year + ")");
            System.out.println("Display variables in European format (" + day + "," + date + "," + month + "," + year + ")");
            System.out.println("Display variables in Japanese format (" + year + "," + month + "," + date + "," + day + ")");

            


        }

    }
