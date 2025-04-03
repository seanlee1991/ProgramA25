package week5;

public class example3 {
    public static void main(String[] args) {
    // print numbers 1 to 10 using for loop
    for (int i = 0; i< 10; i++) {
       System.out.println(i);
    }
  }
 }

//  1~10중짝수만 출력하는 코드짜기
//  for (int i = 1; i <= 10; i++) {
//     if (i % 2 == 0) {  // i가 짝수인 경우에만 출력
//         System.out.println(i);
//     }
// }
// for (int i = 1; i <= 10; i++) {
//     if (i % 2 == 1) {  // i가 홀수인 경우에만 출력
//         System.out.println(i);
//     }
// }
// public class ContinueExample {    

// 	public static void main(String[] args) {        
// 		// Loop from 1 to 10        
// 		for (int i = 1; i <= 10; i++) {            
// 			// If the number is even, skip the iteration            
// 			if (i % 2 == 0) {                
// 				continue;            
// 			}            
// 			// Print the odd number            
// 			 System.out.println(i);       
// 		 }    
// 	}
// }



// The loop iterates from 1 to 10.
// The continue statement skips any even numbers (i.e., numbers where i % 2 == 0).
// As a result, only odd numbers are printed: 1, 3, 5, 7, 9.
