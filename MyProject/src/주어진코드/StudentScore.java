package 주어진코드;

import java.util.Scanner;

public class StudentScore {
	
	// 10반
	// 20명
	// 6과목
	// 국어 영어 수학 사회 과학 자바
	
	static int [][][] classStudentScore = new int[10][20][6];
	
	// 합계, 평균
	static double[][][] classStudentData= new double[10][20][2];
	
	// 반등수, 전교등수
	static int[][][] classStudentRank = new int[10][20][2];
	
	// 과목별 반등수, 전교등수
	static int[][][][] subjectStudentRank = new int[10][20][6][2];
	
	// 학생 이름
	static String[][] classStudentName = new String[10][20];
	
	// 학생 수
	static int[] classCount = new int[10];
	
	// 반 별 총점
	static int[][] classTotalScore = new int[10][6+1];
	
	// 반 별 평균
	static double[][] classTotalAverage = new double[10][6+1];
	
	// 반 입력여부
	static boolean[] classYn = new boolean[10];
	
	// 학생 입력여부
	static boolean[][] studentYn = new boolean[10][20];
	
	// 과목
	static String[] subjects = {"국어", "영어", "수학", "과학", "자바"};
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 숫자만 입력
	 * @return
	 */
	
	public static int inputNo() {
			int inputNo = 0;
			System.out.print(">> 입력 : ");
			while (!sc.hasNextInt()) {
				System.err.println("숫자만 입력할 수 있습니다.");
				sc.next();
				System.out.print(">> 입력 : ");
			}
			inputNo = sc.nextInt();
			return inputNo;
	}
	
	/**
	 * 
	 */

}
