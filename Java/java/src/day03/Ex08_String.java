package day03;

public class Ex08_String {
	
	public static void main(String[] args) {
		
		/* String은 참조 자료형
		 * → 문자열 한 글자씩 그 자체를 비교할 때는 equlas()를 사용
		 * 
		 * 문자열 사용방법
		 * → 문자열 리터럴(" ")로 지정
		 * → 문자열 객체 생성
		 */
		
		// 문자열 리터럴
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		// 문자열 객체 생성
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a == c : " + (a == c));
		System.out.println("a == d : " + (a == d));
		System.out.println("문자열 비교 : " + a.equals(d));
		
		System.out.println("a == c : " + (a == c));
		System.out.println("문자열 비교 : " + e.equals(f));
	}

}

	/* 출력 결과
	 * a == c : true
	 * a == d : false
	 * 문자열 비교 : true
	 * a == c : true
	 * 문자열 비교 : true
	 */
