package day02;

import java.util.Scanner;

public class Ex22_continue {
	
	public static void main(String[] args) {
		
		// 5개의 정수를 입력받아
		// 양수만 합계를 구하여 출력
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		// -3 -1 1 3 5
		// 5번 반복
		// 반복변수 i = 0~4
		
		System.out.println("5개의 정수를 입력 : ");
		
		for (int i = 0; i <= 4; i++) {
			int n = sc.nextInt();
			if(n < 0)
				continue;
			
			// continue
			// ㄴ 남은 실행문을 무시하고 다음 반복으로 점프
			// while ~> 조건식으로 회귀
			// for ~> 증감식으로 회귀
			sum += n;
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();
	}

}
