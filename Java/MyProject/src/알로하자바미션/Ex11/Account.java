package 알로하자바미션.Ex11;

public class Account {
	
	public static final long MAX_BALANCE = 1000000000;
	public static final int MAX_TRANSFER_AMOUNT = 1000000;
	
	private String accountNumber;
	private String ownerName;
	private long balance;
	private String password;
	
	public Account() {
		this.accountNumber = "없음";
		this.ownerName = "없음";
		this.balance = 0;
		this.password = null;
	}
	
	public Account(String accountNumber, String ownerName, long balance, String password) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		if (setBalance(balance)) {
			
		} else {
			this.balance = 0;
		}
		this.password = password;
	}
	
	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getBalance() {
		return balance;
	}

	boolean setBalance(long balance) {
		if (balance >= 0 && balance <= MAX_BALANCE) {
		this.balance = balance;
		return true;
		}
		System.err.println("잔고는 0원 미만이거나" + MAX_BALANCE + "원 초과일 수 없습니다!");
		return false;
	}
	
	public boolean withdraw(int amount) {
		if (amount <= 0) {
			System.err.println("출금액은 0원보다 커야합니다!");
		}
		if (amount > MAX_TRANSFER_AMOUNT) {
			System.err.println("1회 최대 출금액은 100만원 입니다!");
		}
		if (this.balance < amount) {
			System.err.println("잔고가 부족합니다! (현재 잔고 : " + this.balance +"원)");
			return false;
		}
		
		this.balance = this.balance - amount;
		return true;
	}

	public boolean deposit(int amount) {
		return false;
	}

}
