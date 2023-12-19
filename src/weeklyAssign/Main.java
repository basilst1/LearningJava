package weeklyAssign;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonalDetails BasilST = new PersonalDetails("456789", "BasilST", 2000, 1234, "password");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the type of banking Atm/Online banking");
		String bankingType = sc.nextLine();

		if (bankingType == "Atm") {

			System.out.println("enter your pin");
			int pinentered = sc.nextInt();
			if (pinentered==BasilST.getPin()) {
				
			}
			Atm atm = new Atm();
			

		}
		if (bankingType == "OnlineBanking") {
			
			System.out.println("enter your pin");
			int pinentered = sc.nextInt();
			if (pinentered==BasilST.getPin()) {
				
			}

			OnlineBanking online = new OnlineBanking();

		}
	}

}
