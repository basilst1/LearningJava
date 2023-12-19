package weeklyAssign;

public class PersonalDetails {
//	Create a class which takes care of Persons account details.
//	Person class should have details such as bank account no., name of account holder, total funds available, pin and onlineBankingPassword.

	private String accountNumber;
	private String nameOfAccountHolder;
	private int fundsAvail;
	private int pin;
	private String onlineBankingPassword;
	
	
	public PersonalDetails(String accountNumber , String nameOfAccountHolder, int fundsAvail, int pin, String onlineBankingPassword) {
		this.accountNumber = accountNumber;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.fundsAvail = fundsAvail;
		this.pin = pin;
		this.onlineBankingPassword= onlineBankingPassword;
		
		
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}
	public void setNameOfAccountHolder(String nameOfAccountHolder) {
		this.nameOfAccountHolder = nameOfAccountHolder;
	}
	public int getFundsAvail() {
		return fundsAvail;
	}
	public void setFundsAvail(int fundsAvail) {
		this.fundsAvail = fundsAvail;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}
	public void setOnlineBankingPassword(String onlineBankingPassword) {
		this.onlineBankingPassword = onlineBankingPassword;
	}
	
	
	
}
