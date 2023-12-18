package bankAccount;

public class bankAcc {
	
	
	import java.util.Scanner;

	// Bank Operations class
	class BankOperations {
	    protected double balance;

	    public BankOperations(double initialDeposit) {
	        this.balance = initialDeposit;
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Remaining balance: $" + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. New balance: $" + balance);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void viewBalance() {
	        System.out.println("Current balance: $" + balance);
	    }
	}

	// ATM class extending Bank Operations
	class ATM extends BankOperations {
	    private int pin;

	    public ATM(double initialDeposit, int pin) {
	        super(initialDeposit);
	        this.pin = pin;
	    }

	    public boolean validatePin(int enteredPin) {
	        return enteredPin == pin;
	    }
	}

	// Online Banking class extending Bank Operations
	class OnlineBanking extends BankOperations {
	    private String bankingPassword;

	    public OnlineBanking(double initialDeposit, String bankingPassword) {
	        super(initialDeposit);
	        this.bankingPassword = bankingPassword;
	    }

	    public boolean validatePassword(String enteredPassword) {
	        return enteredPassword.equals(bankingPassword);
	    }
	}

	// Person class with account details
	class Person {
	    private String accountNo;
	    private String accountHolderName;
	    private ATM atm;
	    private OnlineBanking onlineBanking;

	    public Person(String accountNo, String accountHolderName, double initialDeposit, int atmPin, String onlineBankingPassword) {
	        this.accountNo = accountNo;
	        this.accountHolderName = accountHolderName;
	        this.atm = new ATM(initialDeposit, atmPin);
	        this.onlineBanking = new OnlineBanking(initialDeposit, onlineBankingPassword);
	    }

	    public ATM getATM() {
	        return atm;
	    }

	    public OnlineBanking getOnlineBanking() {
	        return onlineBanking;
	    }
	}

	// Main class
	public class Main {
	    public static void main(String[] args) {
	        // Create a person with initial deposit, ATM pin, and online banking password
	        Person person = new Person("123456789", "John Doe", 1000.0, 1234, "password123");

	        // Prompt the user to choose ATM or Online Banking
	        System.out.println("Choose banking service (1 for ATM, 2 for Online Banking): ");
	        Scanner scanner = new Scanner(System.in);
	        int choice = scanner.nextInt();

	        // Validate the ATM pin or online banking password
	        boolean isValid = false;

	        if (choice == 1) {
	            System.out.println("Enter ATM Pin: ");
	            int enteredPin = scanner.nextInt();
	            isValid = person.getATM().validatePin(enteredPin);
	        } else if (choice == 2) {
	            System.out.println("Enter Online Banking Password: ");
	            String enteredPassword = scanner.next();
	            isValid = person.getOnlineBanking().validatePassword(enteredPassword);
	        }

	        if (isValid) {
	            // Perform the desired operation
	            System.out.println("Choose operation (1 for Withdraw, 2 for Deposit, 3 for View Balance): ");
	            int operation = scanner.nextInt();

	            switch (operation) {
	                case 1:
	                    System.out.println("Enter withdrawal amount: ");
	                    double withdrawalAmount = scanner.nextDouble();
	                    person.getATM().withdraw(withdrawalAmount);
	                    break;
	                case 2:
	                    System.out.println("Enter deposit amount: ");
	                    double depositAmount = scanner.nextDouble();
	                    person.getATM().deposit(depositAmount);
	                    break;
	                case 3:
	                    person.getATM().viewBalance();
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	            }
	        } else {
	            System.out.println("Invalid ATM pin or online banking password. Exiting.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}


}
