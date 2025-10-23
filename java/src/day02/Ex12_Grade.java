package day02;

import java.util.Scanner;

public class Ex12_Grade {
	
	public static void main(String[] args) {
		// 학점 입력 후 점수 구간 출력
		// A : 90~100
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		
		// string (문자열) - 참조자료형
		String grade = sc.next();
		
		// 문자, 정수, 문자열은 switch 문의 조건값으로 사용 가능
		// 실수 (float, double)는 조건값으로 사용 불가
		
		
		// break 가 없을시, 이하의 case 실행문을 전부 실행한다 (다음 break; 전까지)
		
		switch (grade) {
			case "A" : System.out.println("90~100점입니다."); break;
			case "B" : System.out.println("80~89점입니다."); break;
			case "C" : System.out.println("70~79점입니다."); break;
			case "D" : System.out.println("60~69점입니다."); break;
			case "F" : System.out.println("60점 미만입니다."); break;
			default : System.out.println("A~F사이의 문자를 입력해주세요."); break;
		}
		sc.close();
	}

}
