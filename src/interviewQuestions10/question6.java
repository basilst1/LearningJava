package interviewQuestions10;

public class question6 {
	int[] numbers = { 1, 3, 5, 11, 14, 19, 21 };
	int firstHighest;
	int secondHighest;

	void findSecondHighest() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = numbers[i];

			}
		}
		System.out.println("Second high number is" + secondHighest);
	}

}
