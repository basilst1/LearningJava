package WaterTankCapacity;

import java.util.Scanner;

public class WaterCapacity {
	int tankCapacity=100;
	int bucketCapacity=10;
	int i=0;
	int currentVolume=0;
	
	

	
	void fillTank() {
       
        for (i=0; i<=tankCapacity; i+=10);
        System.out.println("Tank filled by 10lit ");
    
        
	}
}




        
        
        
        
        
        
        
        
        
        
        
		
		/*while (currentVolume < tankCapacity) {
            if (currentVolume + bucketCapacity <= tankCapacity) {
                currentVolume += bucketCapacity;
                System.out.println("filled");
                } 
            else {
                dint remainingSpace = bucketCapacity - currentVolume;
                currentVolume = bucketCapacity;
                System.out.println("Filled "+remainingSpace+" liters. Tank is now full");
                break;
            }
        }*/