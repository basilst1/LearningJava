package Week5Array;

import java.util.Scanner;

public class phoneBrand {

	String[][] phoneNames = { { "Samsung", "S20", "S21", "Flip 3", "Fold 3" },
			{ "Google", "Google pixel 6", "Pixel 6Pro", "Pixel Pro", "Pixel 5" },
			{ "Apple", "Iphone 12", "Iphone SE", "Iphone 15", "Iphone 13" } };

	Scanner sc = new Scanner(System.in);

	void displayPhoneName() {
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 4; j++) {
				System.out.println(phoneNames[i][j]);

			}
		}

	}

	void getModelName() {
		
		System.out.println("Enter product name:");
		String searchPhone = sc.nextLine();
		boolean productFound = false;
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 4; j++) {
				if (phoneNames[i][j].equals(searchPhone)) {
					productFound= true;
					
					System.out.println("product selected is :" + searchPhone);
				} else {
					System.out.println("Product not found");
				}
				
				
			}
	
		}
	}
}
