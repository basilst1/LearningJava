package Cruise_Ship;

import java.util.Scanner;

public class Cruise {
	public int numberOfDays;
	public double priceForAdults;
	public double priceForKids;
	public int numberAdults;

	public void selectCruise() {

		System.out.println("We offer 4 different packages as displayed below, Please select the cruise ship below: "
				+ "\n" + "Scenic Cruise" + "\n" + "Sunset cruise" + "\n" + "Discovery cruise" + "\n"
				+ "Mystery cruise");

		Scanner sc = new Scanner(System.in);
		String packageName = sc.next();

		switch (packageName) {
		case "Scenic":
			Scenic();
			break;
		case "Sunset":
			numberOfDays = 1;
			priceForAdults = 52.99;
			priceForKids = 15.99;
			break;
		case "Discovery":
			numberOfDays = 4;
			priceForAdults = 39.99;
			priceForKids = 9.99;
			break;
		case "Mystery":
			numberOfDays = 2;
			priceForAdults = 45.99;
			priceForKids = 12.99;
			break;

		}

		System.out.println("The package you have selected is " + packageName + "which is a " + numberOfDays + "cruise");
		System.out.println("Price for adultd" + priceForAdults + "per day");
		System.out.println("Price for adults :" + priceForKids + "per day");

	}

	public void Scenic() {
		numberOfDays = 3;
		priceForAdults = 43.99;
		priceForKids = 12.99;

	}
	
	public void membercount() {
		
		System.out.println("Enter the number of adults: ");
		Scanner sc = new Scanner(System.in);
		String numberAdults = sc.next();
		
		System.out.println("Enter the number of kids: ");
		Scanner sc = new Scanner(System.in);
		String numberKids = sc.next();
		
		
		
	}

	

}
