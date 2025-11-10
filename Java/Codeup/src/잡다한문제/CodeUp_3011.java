/**
 * 버블 정렬 문제
 * 끝까지 대소 비교?
 * 
 * 입력 - 첫줄에 데이터의 개수 n이 입력 // 둘째 줄에 n개의 데이터가 공백을 기준으로 입력됨
 * 
 * 정렬이 끝나는 단계를 출력
 * 
 * 입력 예시)
 * 5 
 * 10 50 30 20 40
 * 출력 예시 ) 2
 */


package 잡다한문제;

import java.util.Scanner;

public class CodeUp_3011 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
	}

}
