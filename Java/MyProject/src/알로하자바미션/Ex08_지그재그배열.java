package 알로하자바미션;

import java.util.Scanner;

public class Ex08_지그재그배열 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] arr = new int[N][N];

		int a = 1;

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = a++;
				}
			}
			else {
				for (int j = N - 1; j >= 0; j--) {
					arr[i][j] = a++;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}