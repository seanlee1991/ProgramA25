public class w2lab2 {

    public static void main(String[] args) {

        int num1 = 233, num2 = 11; // Declare integers

        double sum, diff, prod, quot,quot1,quot2,quot3; // Declare doubles



        sum = num1 + num2; // Addition

        diff = num1 - num2; // Subtraction

        prod = num1 * num2; // Multiplication

        quot = num1 / num2; // division

        quot1 = (double) num1 / num2; 

        quot2 = (double) num1 / (double) num2;

        quot3 = 1.0 * num1 / num2;



        // Output results

        System.out.println("Sum: " + sum);

        System.out.println("Difference: " + diff);

        System.out.println("Product: " + prod);

        System.out.println("Quotient: " + quot);

        System.out.println("Quotient: " + quot1);

        System.out.println("Quotient: " + quot2);

        System.out.println("Quotient: " + quot3);

        System.out.println("HI \n"+num1+ "\n"+num2);



    }

}