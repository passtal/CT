package 알로하자바미션;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07_버블정렬 {
	
	public static void ascend(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int k = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[k]) {
					k = j;
				}
			}
			
			int temp = arr[k];
			arr[k] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void descend(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int p = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[p]) {
					p = j;
				}
			}
			
			int temp = arr[p];
			arr[p] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int studentsSize = 5;
		int[] scores = new int[studentsSize];
		
		for (int i = 0; i < studentsSize; i++) {
			scores[i] = sc.nextInt();
		}
		
		int[] ascendingScores = Arrays.copyOf(scores, scores.length);
		ascend(ascendingScores);
		for (int score : ascendingScores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		int[] descendingScores = Arrays.copyOf(scores, scores.length);
		descend(descendingScores);
		for (int score : descendingScores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		sc.close();
	}
}