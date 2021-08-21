package baekjoonbronze;

import java.util.Scanner;

public class Test2441{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i = 0; i < input; i++) {
        	for(int l = 0; l < i; l++) {
        		System.out.print(" ");
        	}
        	for(int j = input; j > i; j--) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        scan.close();
    }
}