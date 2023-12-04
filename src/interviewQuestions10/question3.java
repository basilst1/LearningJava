package interviewQuestions10;

import java.util.Arrays;

public class question3 {
	
	int [] numbers = {1,3,5,11,14,19,21};
	
	
	
void printDescendingOrder() {
    System.out.println("Array elements in descending order:");
    int n = numbers.length;
    Arrays.sort(numbers);
    for (int i = numbers.length - 1; i >= 0; i--) {
        System.out.print(numbers[i] + " ");
}
    System.out.println();
    
}
}
