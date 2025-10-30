package _1501;

import java.util.Scanner;

public class Ex05_1504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[][] arr = new int[N][N];

		int num = 1;

		for (int j = 0; j < N; j++) {

			if (j % 2 == 0) {
				for (int i = 0; i < N; i++) {
					arr[i][j] = num++;
				}
			} else {
				for (int i = N - 1; i >= 0; i--) {
					arr[i][j] = num++;
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