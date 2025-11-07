package day02;

import java.util.Scanner;

public class Ex13_switchbreak {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		/* 입력받은 정수를 5로 나눈 나머지가
		 * 2보다 작으면 "*" 출력
		 * 그렇지않으면 "**" 출력
		 * 조건) Switch 문을 이용하시오.*/
		
		switch (num % 5) {
			// 0 1 2 3 4
		case 0:
			System.out.println("*");
			break;
		case 1:
			System.out.println("**");
			break;
		default:
			System.out.println("**");
			break;
		}
		
		sc.close();
	}

}
