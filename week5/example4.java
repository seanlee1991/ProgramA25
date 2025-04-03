// for 문을 이용해서 
// *
// **
// ***
// ****
// 출력하기
package week5;

public class example4 {
    public static void main(String[] args) {
// for (int i =1; i < 5; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print("*");
//         if (i == j) {
//             System.out.println();
//         }
//     }
    for (int i =1; i<5; i++) {
        for (int j = 4; j > 0; j--) {
            if (i<j) {
                System.out.println(" ");
            
            } else {
                System.out.println("*");

            }
            
        }
        System.out.println();
    }
}
    }


//반대로출력하기는 