package AmusementPark;

import java.util.Scanner;

public class Amusement {

	int maxCapacity = 10;
	int minHeight = 90;
	int maxHeight = 200;
	int currentCapacity;
	int getHeight;
	int i = 0;

	Scanner sc = new Scanner(System.in);

	/*
	 * void getHeight() { System.out.println("Enter Height"); getHeight=
	 * sc.nextInt(); }
	 */

	void rideCapacity() {

		for (i = 0; i < maxCapacity; i++) {
			System.out.println("Enter height.");
			getHeight = sc.nextInt();
			if (minHeight < getHeight && maxHeight > getHeight) {
				System.out.println("Can enter");

			} else {
				System.out.println("You can't enter");
				
				i--;
			}

		}

	}

}
