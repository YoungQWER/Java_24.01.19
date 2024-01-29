package ex04;

public class BankAccountController {

	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount(
				"001122",
				"김대철",
				10000
				);
		
		bank.displayBalance();
		bank.deposit(1000000);    //100만원 입금
		
		bank.displayBalance();    //잔고확인
		
		bank.withdraw(500000);    //50만 출금
		bank.displayBalance();
	}
}
