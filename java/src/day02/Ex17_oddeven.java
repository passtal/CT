package day02;

public class Ex17_oddeven {
	
	public static void main(String[] args) {
		// 1~20까지의 정수 중
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오
		// 1 3 5 7 ... 17 19 = ?
		// 2 4 6 8 ... 18 20 = ?
		
		// 변수설정 -> a(1~20) sum1(홀수) sum2(짝수)
		
		// 1. 1~20까지 a를 반복
		// 2. a가 홀수인지 짝수인지 판별
		// 3. 홀수이면, sum1에 a를 더하고
		// 4. 짝수면, sum2에 a를 더한다
		
		int a = 1;
		int sum1 = 0;
		int sum2 = 0;
		while (a <= 20) {
			if(a % 2 == 1 )
				sum1 = sum1 + a;
			if(a % 2 == 0 )
				sum2 = sum2 + a;
			a++;
				

		}
		System.out.println("홀수의 합계 : " + sum1);
		System.out.println("짝수의 합계 : " + sum2);
	}
}