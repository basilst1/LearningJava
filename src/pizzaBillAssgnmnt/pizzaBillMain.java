package pizzaBillAssgnmnt;

import java.util.Scanner;

public class pizzaBillMain {

	private static final int addTopping = 0;
	static int totalPriceS;
	static int totalPriceM;
	static int totalPriceL;
	static int newPrice;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pizzaSize();
		addTopping();
		
		
	}

	static Scanner sc = new Scanner(System.in);

	static void pizzaSize() {
		System.out.println("Enter the size of the pizza you want");
		String pizzaSize = sc.next();

		switch (pizzaSize) {
		case "small":
			totalPriceS = 15;
			System.out.println("Price:" + totalPriceS);
			break;
		case "medium":
			totalPriceM = 20;
			System.out.println("Price:" + totalPriceM);
			break;
		case "large":
			totalPriceL = 20;
			System.out.println("Price:" + totalPriceL);
			break;
		default:
			System.out.println("Wrong input");

		}
	}
		
		static void addTopping() {
			System.out.println("do you want extra topping");
			String addTopString = sc.next();
			
			 int addPepperoniSmall = 2;
		     int addPepperoniMediumLarge = 3;
		     int extraCheese = 1;
		        
		     
		     Scanner scanner = new Scanner(System.in);
		     
		     System.out.println("Do you want pepperoni topping? (yes/no): ");
		        String pepperoniInput = scanner.nextLine().toLowerCase();
		        boolean hasPepperoni = pepperoniInput.equals("yes");

		        System.out.println("Do you want extra cheese? (yes/no): ");
		        String cheeseInput = scanner.nextLine().toLowerCase();
		        boolean hasExtraCheese = cheeseInput.equals("yes");
		        
		        int finalBill=0;
		        
		        switch(addTopping) {
		        case "small":
		        	   finalBill += addPepperoniSmall;
		                if (hasPepperoni) {
		                finalBill= totalPriceS+addPepperoniSmall;
		                }
		                break;
		        case "medium":
	            case "large":
	                finalBill += (pizzaSize.equals("medium") ? totalPriceM: totalPriceL);
	                if (hasPepperoni) {
	                    finalBill= totalPriceM+addPepperoniMediumLarge;
	                }
	                break;
	            default:
	                System.out.println("Invalid pizza size.");
	                return; // Exit the program if the size is invalid
	        }

	        if (hasExtraCheese) {
	            finalBill += extraCheese;
	        }

	        // Display the final bill
	        System.out.println("Your final bill is $" + finalBill);

	        // Close the scanner to prevent resource leak
	        scanner.close();
		        	
		        	
		        
			
			
			
			
//
//			switch (addTopping) {
//			case "small":
//				newPrice = totalPrice+2;
//				System.out.println("");
;

			
			
		
			
		}
		
		
			
				
			
		}

}

}
