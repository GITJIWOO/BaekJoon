package baekjoonbronze;

import java.util.Scanner;

public class Test2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		int reserve1 = 0;
		int input2 = scan.nextInt();
		int reserve2 = 0;
		
		while(input1 != 0) {
			int digit = input1 % 10;
			reserve1 = reserve1 * 10 + digit;
			input1 /= 10;
		}
		while(input2 != 0) {
			int digit = input2 % 10;
			reserve2 = reserve2 * 10 + digit;
			input2 /= 10;
		}
		if(reserve1 > reserve2) {
			System.out.println(reserve1);
		} else {
			System.out.println(reserve2);
		}
		scan.close();
	}
}
