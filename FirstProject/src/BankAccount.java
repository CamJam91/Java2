/**
 * This is a bank account that alows for customer deposits and withdrawals
 */
public class BankAccount{
	private int balance;
	static final double INTEREST_RATE = 0.5;

	//constructors
	public BankAccount(){
		balance = 0;
	}
	public BankAccount(int pBalance){
		balance = pBalance;
	}

	//getters
	public int getBalance(){
		return balance;
	}

	public double getAccruedBalance(){
		return balance + balance*INTEREST_RATE;
	}

	//setters
	public void deposit(int money){
		balance += money;
	}
	public void withdraw(int money){
		balance -= money;
	}

	public String toString(){
		return "Your account balance is: " + balance;
	}
}