package WaterTankCapacity;

public class WaterCapacity {
	int tankCapacity;
	int bucketCapacity;

	int tankCapacity1 = 100;
	int bucketCapacity1 = 10;

	void fillTank(int bucketCapacity) {
        int currentVolume = 0;
		int capacity = 0;
		while (currentVolume < capacity) {
            if (currentVolume + bucketCapacity <= capacity) {
                currentVolume += bucketCapacity;
                System.out.println("filled");
                } 
            else {
                int remainingSpace = capacity - currentVolume;
                currentVolume = capacity;
                System.out.println("Filled "+remainingSpace+" litres. Tank is now full");
                break;
            }
        }
	}
}
