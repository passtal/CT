/*
 * 학생 5명의 JAVA 프로그래밍 성적을 입력 받고
 * 1차원 배열에 저장하고 성적을 기준으로 오름차순, 내림차순으로 각각 출력하시오.
 * 단, 정렬 방식은 선택정렬, 버블정렬, 삽입정렬 중 하나의 정렬 방식을 이용하시오.
 * 성적은 정수 0이상 100이하로 주어집니다.
 * 
 * ex
 * 입력 → 90 35 75 100 65
 * 출력 →
 * 35 65 75 90 100
 * 100 90 75 65 35
 */

package JavaTest.Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
	
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
