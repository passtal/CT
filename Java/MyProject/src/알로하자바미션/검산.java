package 알로하자바미션;

import java.util.Random;
import java.util.Scanner;

public class 검산 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int odd=0;
		int even=0;
		
		for(int i=1; i<n; i++) {
			if(i%2==1) {
				System.out.print(i);
				odd += i;
				if(i+2<n) {
					System.out.print("+");
				} else {
					System.out.println("="+odd);
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i);
				even += i;
				if(i<n) {
					System.out.print("+");
				} else {
					System.out.println("="+even);
				}
			}
		}
		System.out.print(n+"의 약수 :");
		for(int i=1; i<=n; i++) {
				System.out.print((i%2==0)?i:" ");
		}
	}

}
