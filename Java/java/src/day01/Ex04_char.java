package day01;

public class Ex04_char {

	public static void main(String[] args) {
		// 문자 데이터 : char
		// * 작은 따옴표 ''로 한 글자의 문자를 표현
		char c1 = 'A';			// 문자 리터럴 : 'A'
		char c2 = 65;			// 십진수 --> 아스키코드표 매핑 문자
		char c3 = '\u0041';		// 유니코드로 지정
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		int unicode = c1;
		
		char b = (char) (c2 + 1);
		// c2 + 1의 단위값을 맞추기 위해 앞의 기준 단위가 되는
		// char 를 붙여줘야 수식으로 성립된다 (강제 형변환)
		// 작은 자료형과 큰 자료형을 연산하면 결과는 큰 자료형이 된다
		// (c2 + 1) : (char) + (int) = (int) --> 자동 형변환
		
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		System.out.println("c4 : " + c4);
		System.out.println("c5 : " + c5);
		System.out.println("c6 : " + c6);
		System.out.println("A의 코드값 : " + unicode);
		
	}
}
