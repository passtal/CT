package day02;

public class Ex15_while {
	
	public static void main(String[] args) {
		// 1~10까지 공백을 두고 출력
		//  1 2 3 4 5 6 7 8 9 10
		int a = 1;
		
		// while (조건) {반복실행문}
		// 반복문에는 반드시 종료 조건이 성립해야 한다
		// 종료조건 불만족시 무한 루프 발생
		
		while (a <= 10) {
			System.out.print(a + " ");
			a = a + 1;
			
			// 복합 대입 연산자
			// a += 1;
			// 증감 연산자
			// a++;
		}
		System.out.println();
		
		System.out.println("a : " + a);
	}

}
