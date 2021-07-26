package baekjoonbronze;

import java.util.Arrays;
import java.util.Scanner;

public class Test10818 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] array = new int[input];
		for(int i = 0; i < input; i++) {
			array[i] = scan.nextInt();
		}
		Arrays.sort(array);
		System.out.printf("%d %d",array[0], array[array.length - 1]);
		scan.close();
	}
}
