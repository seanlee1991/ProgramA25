package week5;

import java.util.Scanner;

public class example2 {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Please enter your ID no.");
		int id = myInput.nextInt();
		while (id != 5) {
			System.out.println("Wrong id entered");
            id = myInput.nextInt(); //If I don't use it it will be infinity
		} 
 	}
}

// 1부터 100까지 합을 출력하는식
// int sum = 0;
// int i = 1;

// while(i<=100) {
//     sum += i;
//     i++;
// }
// system.out.println("1~" + (i-1) + " sum : " + sum);
// }
}