package day02;

import java.util.Scanner;

public class Ex14_switchyield {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		/*
		 * 입력받은 정수를 5로 나눈 나머지가 2보다 작으면 "*" 출력 그렇지않으면 "**" 출력 조건) Switch 문을 이용하시오.
		 */

		String result = switch (num % 5) {
		// 반환값만 지정하는 경우, yield를 생략하고 -> 사용가능
		case 0, 1 -> "*";
		default -> {
			System.out.println("별 2개");
			// 블록의 실행문이 여러줄인 경우 yield 필수
			// yield 반환값;
			yield "**";
		}
		};
		System.out.println(result);

		// yield 사용하지 않은 경우

		String result2;
		switch (num % 5) {
		case 0, 1:
			result2 = "*";
			break;
		default:
			result2 = "**";
			break;
		}
		System.out.println(result2);

		sc.close();
	}

}
