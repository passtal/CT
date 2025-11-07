package day10.Ex01_Lambda;

/**
 * 람다식을 매개변수로 전달
 * 함수
 * 최댓값 , 합계
 */

@FunctionalInterface

interface SmartCalc {
	int calc(int x, int y);
}

public class Ex02_LambdaParameter {

	public static void sum() {
	}

	public static void max() {
	}

	public static void main(String[] args) {
		// 람다식으로 익명함수 정의 → sc1
		// 최댓값 - x y 중 가장 큰 값
		SmartCalc sc1 = (x, y) -> {
			int sum = 0;
			for (int i = x; i <= y; i++) {
				sum += i;
			}
			return sum;
		};

		// 람다식으로 익명함수 정의 → sc2
		SmartCalc sc2 = (x, y) -> {
			int sum = 0;
			for (int i = x; i <= y; i++) {
				sum += i;
			}
			return sum;
		};

		// 결과 출력 및 값 반환
		int result1 = sc1.calc(100, 50);
		int result2 = sc2.calc(1, 10);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
	}

	// Q : 익명함수 or 람다식 을 메소드로 전달할 수 있나요?
	// A : 람다식으로 정의한 익명함수는 인터페이스 타입으로 전할 수 있다.

	public static void smartCalc(SmartCalc sm, int a, int b) {
		int result = sm.calc(a, b);
		System.out.println("result : " + result);
	}

}
