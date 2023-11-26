package multiDimentionalArray;

import java.util.Scanner;

public class userInput {

	String[][] users = { { "pivot@gmail.com", "abcue12" }, { "riya@gmail.com", "sss@12" },
			{ "lal@gmail.com", "ath@12" } };
	Scanner sc = new Scanner(System.in);
//
//	void populateUsers() {
//		
//
//		for (int i = 0; i < users.length; i++) {
//
//			for (int j = 0; j < users[i].length; j++) {
//
//				users[i][j] = sc.next();
//
//			}
//
//		}
//	}
//	
	void findUser () {
		
		System.out.println("Enter the User name you want to check");
		String UserName = sc.next();
		boolean userFound = false;
		
		for (int i = 0; i < users.length; i++) {
			if (users[i][0].equals(UserName)) {
				userFound = true;
				System.out.println("Given username exists");
			} else {
				System.out.println("User Not Found");
			}
			
			
		}

		
		
	}

}
