package src.Sol;

import java.util.Scanner;

public class 메모장 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a >= 1 && b <= 100) {
        	System.out.println(a + " + " + b + " = " + (a + b));
		}
        
        // System.out.printf("%d + %d = %d",a,b,a+b); 도 됨...
    }
}