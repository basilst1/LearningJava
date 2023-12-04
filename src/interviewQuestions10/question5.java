package interviewQuestions10;

public class question5 {

    int[] numbers = {1, 21, 5, 19, 14, 11, 3};

    
    void sortArray() {
    
   
         System.out.println("Sorted array:");
         for (int i=0; i<numbers.length; i++) {
        	 for (int j = 0; j <numbers.length; j++) {
                 if (numbers[j] > numbers[j + 1]) {
                     int temp = numbers[j];
                     numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                 }
             }
        	 
             System.out.print(numbers + " ");
         }
     }
    }

