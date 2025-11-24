// 아 모르겠네; 생성자 초기화햇고 메인메서드? 
// 최대수 햇고 관리자비번햇고 계좌나열햇고 현재계좌개설수 햇고 배열초기화햇고머하지
// 실행, 검증? 일단 case로 숫자 나누고 메뉴출력하고 번호당 다르게 출력하는거 나누고 
// ifelse랑 scin 
package 알로하자바미션.Ex11;

import java.util.Scanner;

public class Bank {
	
	private static final int MAX_CUSTOMER = 1000;
	private static final String ADMIN_PASSWORD = "1111";
	
	private Account[] accountArray;
	private int accountCount;
	
	public Bank() {
		this.accountArray = new Account[MAX_CUSTOMER];
		this.accountCount = 0;
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			bank.printMenu();
			System.out.print("입력 >> ");
			
			if (!sc.hasNextInt()) {
				System.err.println("잘못된 입력입니다. 숫자를 입력해주세요!");
				sc.next();
				continue;
			}
			
			// gpt 돌렸음;; ↓
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			switch (selectNo) {
			case 1:
				bank.createAccount(sc);
				break;
			case 2:
				bank.deposit(sc);
				break;
			case 3:
				bank.withdraw(sc);
				break;
			case 4:
				bank.checkAccount(sc);
				break;
			case 5:
				bank.printAccountList(sc);
				break;
			case 6:
				running = false;
				break;

			default:
				System.err.println("1번 ~ 6번 까지의 메뉴만 선택 가능합니다.");
				break;
			}
		}
		System.out.println("시스템을 종료합니다.");
		sc.close();
	}
	

	// 메뉴 출력
	private void printMenu() {
		System.out.println("==============================");
		System.out.println("1. 계좌등록");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 계좌목록");
		System.out.println("6. 종료");
		System.out.println("==============================");
	}
	
	private void createAccount(Scanner sc) {
		if (accountCount >= MAX_CUSTOMER) {
			System.out.println("본 은행은 최대 " + MAX_CUSTOMER + "명의 고객까지 수용 가능합니다.");
			System.out.println("현재 개설 계좌 수가 최대 한도에 도달했습니다!");
			System.err.println("계좌 개설에 실패했습니다.");
			return;
		}
		
		System.out.print("계좌번호 >> ");
		String accountNumber = sc.nextLine();
		
		if (findAccount(accountNumber != null)) {
			System.err.println("해당 계좌번호는 이미 사용중입니다!");
			return;
		}
		
		System.out.print("예금주>> ");
		String ownerName = sc.nextLine();
		System.out.print("최초예금액>> ");
		
		System.out.print("비밀번호>> ");
		String password = sc.nextLine();
		
		Account newAccount = new Account(accountNumber, ownerName, 0, password);
		
		if (newAccount.setBalance(balance)) {
			accountArray[accountCount] = newAccount;
			accountCount++;
			System.out.println("'" + ownerName + "'님의 계좌가 개설 되었습니다.");
		} else {
			System.out.println("최초 예금액 설정에 실패했습니다. 계좌 개설이 취소됩니다.");
		}
	}
	
	private Account findAccount(String accountNumber) {
		return null;
	}
	
	private boolean findAccount(boolean b) {
		return false;
	}
	
	long balance;

	private void deposit(Scanner sc) {
		System.out.println("============= 입금 =============");
		System.out.print("계좌번호>> ");
		String accountNumber = sc.nextLine();
		
		Account account = findAccount(accountNumber);
		if (account == null) {
			System.err.println("계좌가 조회되지 않습니다.");
			return;
		}
		
		System.out.print("입금액>> ");
		
		int amount;
		
		if (sc.hasNextInt()) {
			amount = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("금액은 숫자로만 입력 가능합니다.");
			sc.next();
			sc.nextLine();
			return;
		}
		
		if (amount > Account.MAX_TRANSFER_AMOUNT) {
			System.err.println("1회 최대 입금액은 " + Account.MAX_TRANSFER_AMOUNT + "원 입니다.");
			System.err.println("입금에 실패했습니다.");
			return;
		}
		
		System.out.println("'" + account.getOwnerName() +"'님에게 입금하시겠습니까?");
		System.out.println("1. 예");
		System.out.println("2. 아니오");
		System.out.print("입력>> ");
		
		String input = sc.nextLine();
		switch (input) {
		case "1":
			System.out.println("입금되었습니다.");
			break;
		case "2":
			System.out.println("입금이 취소되었습니다.");
			break;
		default:
			System.err.println("올바른 숫자를 입력해주세요.");
			return;
		}
		
		if (account.deposit(amount)) {
			System.out.println("'" + account.getOwnerName() + "'님의 계좌에 " + amount + "원이 입금되었습니다.");
		} else {
		}
		
	}
	
	private void withdraw(Scanner sc) {
		System.out.println("============= 출금 =============");
		System.out.print("계좌번호>> ");
		String accountNumber = sc.nextLine();
		
		Account account = findAccount(accountNumber);
		if (account == null) {
			System.err.println("계좌번호를 찾을 수 없습니다!");
			return;
		}
		
		String password = sc.nextLine();
		
		if (!account.getPassword().equals(password)) {
			System.err.println("비밀번호가 다릅니다!");
			return;
		}
		
		System.out.print("출금액>> ");
		int amount;
		if (sc.hasNextInt()) {
			amount = sc.nextInt();
			sc.nextLine();
		} else {
			System.err.println("금액은 숫자로 입력해야 합니다!");
			sc.next();
			sc.nextLine();
			return;
		}
		
		if (account.withdraw(amount)) {
			System.out.println("'" + account.getOwnerName() + "'님의 계좌에 " + amount + "원이 출금되었습니다.");
		} else {
		}
	}
	
	private void checkAccount(Scanner sc) {
		System.out.println("============== 계좌조회 =============");
		System.out.print("계좌조회>> ");
		String accountNumber = sc.nextLine();
		
		Account account = findAccount(accountNumber);
		if (account == null) {
			System.err.println("계좌번호를 찾을 수 없습니다.");
			return;
		}
		
		System.out.print("비밀번호>> ");
		String password = sc.nextLine();
		
		if (!account.getPassword().equals(password)) {
			System.err.println("비밀번호가 다릅니다!");
			return;
		}
		
		System.out.println("'" + account.getOwnerName() + "'님의 계좌에 " + account.getBalance() + "원이 출금되었습니다.");
	}
	
	private void printAccountList(Scanner sc) {
		System.out.print("관리자 비밀번호>> ");
		String adminPassword = sc.nextLine();
		
		System.out.println(" ============= 계좌목록=============");
		System.out.println();
	}


}
