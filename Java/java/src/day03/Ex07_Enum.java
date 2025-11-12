/* enum (열거타입) 정의
 * 열거타입 enum은 파일로도 정의할 수 있고
 * 클래스 파일 내부에서 정의할 수도 있다
 */

package day03;

enum Test {A, B, C, D, E, F}

public class Ex07_Enum {
	
	public static void main(String[] args) {
		
		/* enum(열거타입)
		 * → 요소들을 명명한 값으로 집합을 이루는 자료형
		 * 
		 * 특징
		 * → enum을 비교할 때는 값 뿐만 아니라 타입도 비교한다.
		 * → enum의 상수값이 재정의되어도 다시 컴파일할 필요가 없다.
		 * 
		 * enum 관련 메소드
		 * → values()		: 열거타입의 모든 요소를 배열로 변환
		 * → valuesOf()		: 전달된 문자열과 일치하는 열거타입 상수를 반환
		 * → ordinal()		: 해당 열거타입 상수가 정의된 순서(index)를 반환
		 */
		
		Rainbow[] rainbow = Rainbow.values();
		
		for (Rainbow color : rainbow) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		Rainbow G = Rainbow.valueOf("PURPLE");
		System.out.println("G : " + G);
		
		int index = G.ordinal();
		System.out.println("PURPLE의 index : " + index);
	}
	
}

/* 실행 결과
 * 
 * RED ORANGE YELLOW GREEN BLUE NAVY PURPLE 
 * G : PURPLE
 * PURPLE의 index : 6
 */
