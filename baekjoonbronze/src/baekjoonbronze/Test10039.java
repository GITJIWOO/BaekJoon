package baekjoonbronze;

import java.util.Scanner;

public class Test10039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input1 = scan.nextInt();
		int input2 = scan.nextInt();
		int input3 = scan.nextInt();
		int input4 = scan.nextInt();
		int input5 = scan.nextInt();
		if(input1 <= 40) {
			input1 = 40;
		}
		if(input2 <= 40) {
			input2 = 40;
		}
		if(input3 <= 40) {
			input3 = 40;
		}
		if(input4 <= 40) {
			input4 = 40;
		}
		if(input5 <= 40) {
			input5 = 40;
		}
		System.out.println((input1 + input2 + input3 + input4 + input5) / 5);
		scan.close();
	}
}
