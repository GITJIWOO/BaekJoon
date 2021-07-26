package baekjoonbronze;

import java.util.Scanner;

public class Test1712 {
	public static void main(String[] args) {
		// 월드전자는 노트북을 제조하고 판매하는 회사이다.
		// 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며,
		// 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
		// 예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며,
		// 열 대 생산하는 데는 총 1,700만원이 든다.
		// 노트북 가격이 C만원으로 책정되었다고 하자,
		// 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다.
		// 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
		// A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
		// 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); 	// 고정 비용
		int b = scan.nextInt(); 	// 가변 비용
		int c = scan.nextInt(); 	// 노트북 가격
		
		long totalAB = 0; 		// 총 비용
		long totalC = 0; 		// 총 수입
		long number = 0;		// 판 갯수
		
		if(b >= c) { 						// 손익분기점이 없다면 출력
			System.out.println("-1"); 		// -1 출력
		} else { 							// 1개 이상 판매할 수 있으니 else문이 돌아간다.
			totalAB += a; 					// 고정비용을 먼저 총 비용 변수에 넣는다.
			while(true) { 					// 손익분기점을 넘을 때 까지 돌아간다.
				totalAB += b; 				// 한 대를 팔았으니  총 비용에 가변비용을 넣는다. 
				totalC += c; 				// 총 수입에 노트북 가격을 넣는다.
				number++; 					// 판 갯수 +1
				if(totalAB < totalC) { 		// 손익분기점을 넘었다면 멈춘다.
					System.out.println(number);
					break;
				}
			}
		}
		scan.close();
	}
}
