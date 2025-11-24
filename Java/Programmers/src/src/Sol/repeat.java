package src.Sol;

import java.util.Scanner;

public class repeat {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		
		System.out.println(str.repeat(n));
		sc.close();
	}

}
