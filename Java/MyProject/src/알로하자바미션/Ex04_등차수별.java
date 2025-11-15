package 알로하자바미션;

import java.util.Scanner;

public class Ex04_등차수별 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			// N번 반복해서 N개의 행을 만드는 것이므로
			// i = 0, i < N 이런식으로 만들었다가는 입력한 숫자 - 1 행이 만들어져 
			// 문제 요구 사항이 충족되지 않는다
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		sc.close();
	}
}
