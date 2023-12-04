package interviewQuestions10;

public class question4 {
	private static final int i = 0;
	int[] numbers = { 1, 3, 5, 11, 14, 19, 21 };
	int smallest;
	int largest;

	void reOrder() {
		for (int i = 0; i < numbers.length; i++)
			;

		if (numbers[i] > largest) {
			largest = numbers[i];
return;
		}
		if (numbers[i] < smallest) {
			smallest = numbers[i];
return;		}

	}
}
