package 알로하자바미션;

import java.util.Scanner;

public class Ex01_합계와평균 {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        int eng;
        int math;
        int java;

        eng = sc.nextInt();
        math = sc.nextInt();
        java = sc.nextInt();

        int sum = eng + math + java;
        double average = (double) sum / 3; 

        System.out.println("영어 점수 : " + eng);
        System.out.println("수학 점수 : " + math);
        System.out.println("자바 점수 : " + java);
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f\n", average);

        sc.close();
    }
}