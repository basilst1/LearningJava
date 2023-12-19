package bankAccount;

public class bankAccount {

	private String accountNo;
	private String accountHolderName;
	private int atm;
	private String onlineBanking;

	public void Person(String accountNo, String accountHolderName, double initialDeposit, int atmPin, String onlineBankingPassword, int atm, String onlineBanking) {
	        this.accountNo = accountNo;
	        this.accountHolderName = accountHolderName;
	        this.atm = atm;
	        this.onlineBanking = onlineBanking;
	    }

	public ATM getATM() {
		return atm;
	}

	class BankOperations {
		private double balance;

		public BankOperations(double initialDeposit) {
			this.balance = initialDeposit;
		}

		public void withdraw(double amount) {
			if (amount > 0 && amount <= balance) {
				balance = balance - amount;

				System.out.println("Withdrawal successful. Remaining balance: $" + balance);
			} else {
				System.out.println("Invalid withdrawal amount or insufficient funds.");
			}
		}

		public void deposit(double amount) {
			if (amount > 0) {
				balance = balance + amount;
				System.out.println("Deposit successful. New balance: $" + balance);
			} else {
				System.out.println("Invalid deposit amount.");
			}
		}
	}
}

//
//	public String name;
//	private String accountNumber;
//	private double balance;
//	private int atmPin;
//	public int getAtmPin; 
//	
//	
//	
//	public bankAccount(String name, String accountNumber, double balance, int atmPin) {
//		super();
//		this.name = name;
//		this.accountNumber = accountNumber;
//		this.balance = balance;
//		this.setAtmPin(atmPin);
//		
//	}
//
//
//
//	public String getAccountNumber() {
//		return accountNumber;
//	}
//
//
//
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
//
//
//
//	public double getBalance() {
//		return balance;
//	}
//
//
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}
//
//
//
//	public int getAtmPin() {
//		return atmPin;
//	}
//
//
//
//	public void setAtmPin(int atmPin) {
//		this.atmPin = atmPin;
//	}
//	
//	
//	
//
