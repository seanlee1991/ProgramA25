package week8;

public class practice32 {

    //전달값이 있는 메소드드
    public static void power(int number) { //parameter
        int result = number * number;
        System.out.println(number + "^2 = " + result);

    }

    public static void powerByExp (int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
            
        }
        System.out.println(number + "의" + exponent + "승 = " + result);
    }
    public static void main(String[] args) {
        //전달값, parameter
        // 2-> 2*2 = 4
        // 3 -> 3*3 = 9

        //argument, 인수수
        power(2);
        power(3);

        powerByExp(2, 3);
        powerByExp(3, 0);
        
    }
}
