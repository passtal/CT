/** 

n이 입력되면 크기가 n인 다음과 같은 2차원 배열을 출력하시오.

입력 예)
3
출력 예)
1 2 3
4 5 6
7 8 9

 */
package _1501;

import java.util.Scanner;

public class Ex01_1501 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = 1;
				
		int[][] arr = new int [n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = k++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");;
			}
			System.out.println();
		}
		sc.close();
	}
}	
	

