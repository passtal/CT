// 자동은 6번 코드 활용하여 구하고
// 게임당 자동인지 수동인지 고르게 확인하라는거지
// 수동일때는  ①: ,  ②: , ③: ,  ④: , ⑤: , ⑥: println으로 출력되게 해주고
// 자동인 경우 결과 출력에서 자 동 ----
// 수동인 경우 결과 출력에서 수 동 -----


package 알로하자바미션.Ex13;

import java.util.Iterator;
import java.util.Scanner;

public class 하나주세요나머지는다자동이요 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 게임?");
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			System.out.print("[" + (i+1) + "게임] : ");
			int lotto[] = new int[6];
			
			for (int j = 0; j < lotto.length; j++) {
				int rand = (int) (Math.random() * 45) + 1;
				lotto[j] = rand;
				
				for (int k = 0; k < j; k++) {
					if (rand == lotto[k]) {
						j--;
						break;
					}
				}
			}
			
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
// 패스;;;;
}
