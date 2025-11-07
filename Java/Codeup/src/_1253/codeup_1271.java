package _1253;

import java.util.Scanner;

public class codeup_1271 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		int max = 0;
		
		for (int i = 0; i < n ; i++) {
			int input = sc.nextInt();
			
			if (max < input) {
				max = input;
			}
		}
				
		System.out.print(max);
		sc.close();
	}	

}	
	









