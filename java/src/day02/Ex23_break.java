package day02;

import java.util.Scanner;

public class Ex23_break {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력 : ");
			String input = sc.nextLine();
			if( input.equals("STOP") )
				break;
			System.out.println(">> " + input);
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
