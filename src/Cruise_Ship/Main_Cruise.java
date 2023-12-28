package Cruise_Ship;

import java.util.Scanner;

public class Main_Cruise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("We offer different packages. Please enter the cruise you want to select:");
	        System.out.println("1. Scenic Cruise");
	        System.out.println("2. Sunset Cruise");
	        System.out.println("3. Discovery Cruise");
	        System.out.println("4. Mystery Cruise");

	      
	        
	        int cruiseChoice = scanner.nextInt();
	        Cruise selectedCruise;

	        switch (cruiseChoice) {
	        case 1:
	            selectedCruise = new ScenicCruise();
	            break;
	        case 2:
	            selectedCruise = new SunsetCruise();
	            break;
	        case 3:
	            selectedCruise = new DiscoveryCruise();
	            break;
	        case 4:
	            selectedCruise = new MysteryCruise();
	            break;
	        default:
	            System.out.println("Invalid choice. Exiting program.");
	            return;
	    }


	        System.out.println("The cruise that you have selected is " + selectedCruise.getCruiseName() +
	                " which is a 2-day cruise: " + selectedCruise.getAdultRate() + " per day for adults and " +
	                selectedCruise.getChildRate() + " per day for children above 5.");
	}
	

public class User() 
{
    System.out.println("Welcome to Cruise Booking.");
    System.out.println("Please sign up to book a cruise.");


    User user = new User();
    System.out.println("Enter your email address:");
    Scanner scanner;
	user.setUsername(scanner.next());

    System.out.println("Enter the password that you want to use:");
    user.setPassword(scanner.next());

    System.out.println("Enter your Full Name:");
    user.setFullName(scanner.nextLine());

    System.out.println("Enter your phone number:");
    user.setPhoneNumber(scanner.next());

    System.out.println("Thank you for registering!");

 
    System.out.println("Please login to continue.");
    System.out.println("Enter your username:");
    String enteredUsername = scanner.next();

    System.out.println("Enter your password:");
    String enteredPassword = scanner.next();


    if (enteredUsername.equals(user.getUsername()) && enteredPassword.equals(user.getPassword())) {
        System.out.println("Login successful!");
        System.out.println("We offer 4 different packages as displayed below. Please enter the cruise that you want to select.");
        System.out.println("1. Scenic Cruise");

        int cruiseChoice = scanner.nextInt();
        Cruise selectedCruise;

        switch (cruiseChoice) {
            case 1:
                selectedCruise = new ScenicCruise();
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                return;
        }

        System.out.println("The cruise that you have selected is " + selectedCruise.getCruiseName() +
                " which is a 2-day cruise: $" + selectedCruise.getAdultRate() + " per day for adults and $" +
                selectedCruise.getChildRate() + " per day for children above 5.");

        System.out.println("Please press Y if you want to continue with the selection or any other key to exit.");
        String continueChoice = scanner.next();


      
    } else {
        System.out.println("Invalid username or password. Exiting program.");
    }

    scanner.close();

}

private Object getUsername() {
	// TODO Auto-generated method stub
	return null;
}

private void setPhoneNumber(String next) {
	// TODO Auto-generated method stub
	
}

private void setFullName(String nextLine) {
	// TODO Auto-generated method stub
	
}

private void setPassword(String next) {
	// TODO Auto-generated method stub
	
}

private void setUsername(String next) {
	// TODO Auto-generated method stub
	
}

private Object getPassword() {
	// TODO Auto-generated method stub
	return null;
}
