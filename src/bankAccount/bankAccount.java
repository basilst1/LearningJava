package bankAccount;

public class bankAccount {

	public String name;
	private String accountNumber;
	private double balance;
	private int atmPin;
	public int getAtmPin; 
	
	
	
	public bankAccount(String name, String accountNumber, double balance, int atmPin) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.setAtmPin(atmPin);
		
	}



	public String getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public int getAtmPin() {
		return atmPin;
	}



	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}
	
	
	

}
