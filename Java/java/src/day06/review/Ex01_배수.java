package day06.review;

import java.util.Scanner;

public class Ex01_배수 {
	
	// main method ~ 프로그램 실행 시 가장 먼저 실행되는 메소드
	
	public static void main(String[] args) {
		// 정수 하나를 입력받아서 입력받은 수가 3의 배수인지 아닌지 판단 후 그 여부를 출력하는
		// 3의 배수 ~ "3의 배수입니다."
		// 3의 배수 x ~ "3의 배수가 아닙니다."
		// 순서도 작성 (필요한 코드가 무엇일까?)
		// 1. 정수 입력
		// ~import 방법~
		// 클래스 뒤에서 ctrl space
		// 같은 줄에서 ctrl 1
		// 아무데서나 ctrl shift o
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 2. 3의 배수인지 판단
		if (N != 0 && N % 3 == 0) {
			// 3. 3의 배수여부 출력
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		
		// 조건 연산자
		// (조건) ? (참일 때 값) : (거짓일 때 값)
		// if~else 구문과 조건연산자는 치환할 수 있다.
		
		String answer = (N != 0 && N % 3 == 0) ? "3의 배수입니다." : "3의 배수가 아닙니다";
		System.out.println(answer);
		sc.close();
	}

}
