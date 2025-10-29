package day07.Ex11_사용자정의예외;

public class Account {

	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	// 입금
	public void deposit(int money) {
		balance += money;
	}

	// 출금
	void withdraw(int money) throws BalanceException { // 예외전가
		// (잔고) < (출금액) : 출금할 수 없음 - 예외로 간주

		if (balance < money) {
			// 예외 강제 발생
			// throw new XXXEception();
			throw new BalanceException("잔고가 부족합니다." + (money - balance) + "원이 부족합니다.");
		}
		balance -= money;
	}

}
