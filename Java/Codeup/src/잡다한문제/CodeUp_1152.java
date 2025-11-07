package 잡다한문제;

import java.util.Scanner;

public class CodeUp_1152 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 10) {
			System.out.println("small");
		} else {
			System.out.println("big");
		}
		sc.close();
	}

}
