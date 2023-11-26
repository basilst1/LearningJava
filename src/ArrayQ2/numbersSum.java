package ArrayQ2;

public class numbersSum {

	int[] numbers = { -40, -5, 1, 3, 6, 7, 8, 20 };
	int targetSum = 15;

	void findSum() {

		System.out.println("Pair of elements whose sum is equal to " + targetSum + ":");

		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == targetSum) {
					System.out.println(numbers[i] + ", " + numbers[j]);
				}
			}
		}
	}

}
