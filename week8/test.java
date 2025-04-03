package week8;

import java.util.Scanner;

public class test {

    public static double faherenheitToCelsius(double fah_input) {
        double cal_celsius = (fah_input - 32) * 5/9;
        return cal_celsius;

    }

    public static void printTemperature(double fah_temp_input) {
        System.out.println("F: " + fah_temp_input );
        System.out.println("C: " + faherenheitToCelsius(fah_temp_input));

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Faherenheit temperature: ");
        double fah_temp = input.nextDouble();
        printTemperature(fah_temp);
        
    }
}
