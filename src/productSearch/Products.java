package productSearch;

import java.util.Scanner;

public class Products {

	String[] samsungProducts = { "S20", "S21", "Flip 3", "Fold 3" };
	String [] googlePhones = {"Prixel 6", "Pixel 6 pro", "Pixel pro", "Pixel 5"};
	String [] appleProducts = {"Iphone12", "Iphone SE", "Iphone 15", "Iphone 13"};
	
	String brand;
	
	Scanner sc = new Scanner(System.in);
	

	void displayProducts() {
		
		boolean isValidBrandSelected= false;
		while (isValidBrandSelected) {
			System.out.println("Enter the brand name you wish to search"+ brand);
			brand = sc.nextLine();
			
			if (brand.equalsIgnoreCase("Samsung")) {
				for (int i=0; i < samsungProducts.length; i++);
				System.out.println(samsungProducts);
				isValidBrandSelected =true;
			}else if (brand.equalsIgnoreCase("Google")) {
				for (int i=0; i <googlePhones.length; i++);
				System.out.println(googlePhones);
				isValidBrandSelected = true;
			}
			else if (brand.equalsIgnoreCase("Apple")) {
				for (int i=0; i<appleProducts.length; i++);
				System.out.println(appleProducts);
				isValidBrandSelected = true;
			} else {
				System.out.println("Can't find the brand you selected");
				
			}
			
				
				
				
				
				
			}
		}
	}


