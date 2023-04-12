package test1;

public class Account {
	// 필드
	int accountId;
	String password;
	String ownerName;
	int balance=0;;

	// 생성자
	public Account(int accountId, String password, String ownerName) {
		this.accountId = accountId;
		this.password = password;
		this.ownerName = ownerName;
	}

	// 매서드
	public void deposit(int money) {
		balance += money;

		System.out.println(balance + "원 입금되었습니다.");
	}

	public int checkBalance(String password) {

		if (isCorrectPassword(password)) {
			System.out.println("현재잔액은:" + balance + "원 입니다.");
		} else {
			System.out.println("패스워드가 틀렸습니다.");
		}

		return balance;
	}

	public int withdraw(int money, String password) {

		if (isCorrectPassword(password)) {
			if (money > balance) {

				System.out.println("남은잔액을 초과 하였습니다.| 남은잔액은: " + balance + "원 입니다.");

			} else {
				balance -= money;
				System.out.println(money + "원을 출금하였습니다. | 남은잔액은" + balance + "원 입니다.");

			}
		} else {
			System.out.println("패스워드가 틀렸습니다.");
		}

		return balance;
	}
	
	public boolean isCorrectPassword(String password) {
		return this.password.equals(password)? true:false;
	}
	
	
	public static void main(String[] args) {
		
		// 계좌 생성
		Account account = new Account(1, "password!@#", "park");

		// 10만원 입금
		account.deposit(100000);

		// 잔액 확인
		account.checkBalance("password!@#");
		// System.out.println(account.checkBalance("password!@#"));

		// 2만원 출금
		account.withdraw(20000, "password!@#");

		// 잔액 확인
		account.checkBalance("password!@#");
		// System.out.println(account.checkBalance("password!@#"));

	}
}
