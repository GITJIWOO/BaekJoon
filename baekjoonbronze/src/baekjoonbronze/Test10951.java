package baekjoonbronze;


import java.util.Scanner;

public class Test10951 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input1;
		int input2;
		while(scan.hasNext()) {
			System.out.println((input1 = scan.nextInt()) + (input2 = scan.nextInt()));
		}
		scan.close();
	}
}
