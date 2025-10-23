package _1253;

import java.util.Scanner;

public class ex01_1253 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		int b = sc.nextInt();

		
		
		if(a < b) 
			for (int i =a; i <= b; i++) {
				System.out.print(i + " ");
				}
		else 
			for (int j = b; j <= a; j++) {
				System.out.print(j + " ");
			};
			
	}
			
			
}		
