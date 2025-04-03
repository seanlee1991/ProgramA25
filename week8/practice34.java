package week8;

public class practice34 {

    
    public static int getPower(int number) {
        return number * number;
        //int result = number * number;
        //return result;
    }


    public static int getPowerByExp (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        int returnVal = getPower(2);
        System.out.println(returnVal);

        returnVal = getPower(3);
        System.out.println(returnVal);

        returnVal = getPowerByExp(3, 3);
        System.out.println(returnVal);

        System.out.println(getPowerByExp(4, 6));
        
    }
}

