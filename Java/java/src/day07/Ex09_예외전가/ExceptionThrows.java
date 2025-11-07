package day07.Ex09_예외전가;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			// input() 메소드에서 예외를 전가했기 때문에
			// 호출한 곳에서 예외 처리를 해야한다.
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("정수를 입력해주세요.");
		}

	}

	public static void input() throws InputMismatchException {
		System.out.println("입력 : ");
		int input = sc.nextInt();
		System.out.println(input);
	}
}
