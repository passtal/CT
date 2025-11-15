package 알로하자바미션;

import java.util.Scanner;

public class Ex06_동행복권 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + "게임] : ");
			int lotto[] = new int[6];
			
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int) (Math.random() * 45 ) + 1;
				lotto[j] = rand;
				
				for (int k = 0; k < j; k++) {
					if( rand == lotto[k] ) {
						j--;		
						break;
					}
				}
			} 
			
			// 버블 정렬 사용
			for (int j = 0; j < lotto.length-1; j++) {
				for (int k = 0; k < lotto.length-1-j; k++) {
					if( lotto[k] > lotto[k+1] ) {
						int temp = lotto[k];
						lotto[k] = lotto[k+1];
						lotto[k+1] = temp;
					}
				}
			} 
			
			
			for (int j = 0; j < lotto.length; j++) {
				System.out.print(lotto[j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}