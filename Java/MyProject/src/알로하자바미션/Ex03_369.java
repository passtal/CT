package 알로하자바미션;

public class Ex03_369 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			int K = i;
			int count = 0;
			
			while (K > 0) {
				int N = K % 10;
				if (N == 3 || N == 6 || N == 9) {
					count++;
				}
				K = K / 10;
			}
			
			if (count > 0) {
				for (int j = 0; j < count; j++) {
					System.out.println("*");
				}
			} else {
				System.out.println(i);
			}
			
			if (i < 100) {
				System.out.println();
			}
					
		}
	}
}

