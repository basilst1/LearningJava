package interviewQuestions10;

public class question8 {
    int[] numbers = {1, 3, 5, 11, 14, 19, 21, 3};

    
    
    
    void multipleDuplicates() {
    	for (int i = 0; i<numbers.length;i++);{
    	for (int j= 0; j<numbers.length;j++);{
			int i = 0;
			int j = 0;
			if (numbers[i]==numbers[j]) {
    			System.out.println("multiple entry founded" + numbers[i]);
    			
    		}
    	}
    	
    }
}
}
