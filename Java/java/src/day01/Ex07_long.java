package day01;

public class Ex07_long {
	
	public static void main(String[] args) {
		// int (4bytes : 32bits): 2^32개 : 약 42억개
		// int 수 표현 범위			: -21억xxx ~ 21억xxx
		
		// long (8byte : 64bits): 2^64개
		long ln1 = 1000;
		long ln2 = 2100000000;
		long ln3 = 2200000000L;
		// 자바에서 기본 정수는 int 타입으로 인식
		// L을 붙이지 않으면 기본정수를 int로 인식 -> 21억 표현x
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}

}
