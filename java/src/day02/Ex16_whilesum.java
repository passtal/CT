package day02;

public class Ex16_whilesum {
	
	public static void main(String[] args) {
		// 1~100까지의 합계
		// 1+2+3 ... +99+100
		
		int a = 1;
		
		int sum = 0;
		
		while (a <= 100) {
			sum = sum + a;
			a = a + 1;
			
		// 방법 2
			
		//	sum = sum + a++;
			
		//	sum += a++;
			
		}
		System.out.println();
		
		System.out.println(sum);
	}

}
