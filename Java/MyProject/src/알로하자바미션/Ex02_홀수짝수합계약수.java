package 알로하자바미션;

import java.util.Scanner;

public class Ex02_홀수짝수합계약수 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int oddSum = 0;
        int evenSum = 0;
        
        String odd = " ";
        String even = " ";
        String division = " ";
        
        for (int i = 1; i <= N; i++) {
        	
            if (i % 2 != 0) {
                oddSum += i;
                odd = odd + i + " + "; 
            } else {
                evenSum += i;
                even = even + i + " + "; 
            }

            if (N % i == 0) {
            	division = division + i + " ";
            }
        
        }
        
        String finalOdd;
        if (odd.length() > 0) {
			finalOdd = odd.substring(0, odd.length() - 1);
		} else {
			finalOdd = " ";
		}
        System.out.println(finalOdd + " = " + oddSum); 
        
        String finalEven;
        if (even.length() > 0) {
			finalEven = even.substring(0, even.length() - 1);
		} else {
			finalEven = " ";
		}
        System.out.println(finalEven + " = " + evenSum);
        
        System.out.println(division);
       
        sc.close();
	}

}
