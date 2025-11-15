package 알로하자바미션;

import java.util.Scanner;

public class Ex05_수원왕갈비치킨 {
	
	static int orderCount = 0;
	
	public static void printMenu() {
		System.out.println("********** 메뉴판 **********");
		System.out.println("1. 황금올리브 반반한 치킨");
		System.out.println("2. 뿌잉클 치킨");
		System.out.println("3. 처갓집에서 호식이가 만든 치킨");
		System.out.println("0. 종료");
		System.out.println("********** 번호: ");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menuNum;
		
		do {
			printMenu();
			
			if (sc.hasNextInt()) {
				menuNum = sc.nextInt();
			} else {
				sc.next();
				menuNum = 4;
			}
			
			String menuName = " ";
			
			switch (menuNum) {
			case 1: 
				menuName = "황금올리브 반반한 치킨";
				orderCount++;
				break;
				
			case 2: 
				menuName = "뿌잉클 치킨";
				orderCount++;
				break;
				
			case 3: 
				menuName = "처갓집에서 호식이가 만든 치킨";
				orderCount++;
				break;
				
			case 0: 
				break;
				
			default:
				System.out.println("(0~3) 사이의번호를입력해주세요.");
				continue;
			}
			
			if (menuNum >= 1 && menuNum <= 3) {
				System.out.println("'" + menuName + "'이(가) 주문되었습니다.");
			}
			
			if (menuNum != 0) {
				
			}
		
		} while (menuNum != 0);
		
		System.out.println("총" + orderCount + "개의 상품이 주문되었습니다.");
		
		sc.close();
	}

}