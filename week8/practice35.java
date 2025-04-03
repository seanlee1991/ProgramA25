package week8;

public class practice35 {
    //method overloading
    //1.전달값의 타입이 다르거나 2.갯수가 다르거나 3.반환형이 다르면 안됨. static뒤에는 변수형태가 같아야함.

    public static int getPower(int number) { //"4"
        return number * number;
        //int result = number * number;
        //return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }


    public static int getPower (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 3));
        
    }
}
