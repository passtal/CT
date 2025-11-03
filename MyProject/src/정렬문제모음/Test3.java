package 정렬문제모음;

import java.util.Scanner;

public class Test3 {

	public static void insertionSort(int[] arr) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int key = arr[i];

			int j = i - 1;

			while (j >= 0 && arr[j] > key) {

				arr[j + 1] = arr[j];

				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}

		insertionSort(numbers);

		for (int number : numbers) {
			System.out.println(number);
		}
		sc.close();
	}
}