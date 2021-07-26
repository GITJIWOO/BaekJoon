package baekjoonbronze;


import java.util.Scanner;

public class Test2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int result = input1 * input2 * input3;
		String string = Integer.toString(result);
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < string.length(); j++) {
				if ((string.charAt(j) - '0') == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}
