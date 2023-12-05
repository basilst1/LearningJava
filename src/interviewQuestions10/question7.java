package interviewQuestions10;

import java.util.Scanner;

public class question7 {
	
	
	   Scanner scanner = new Scanner(System.in);

void fibonaciSeries() {
       System.out.println("Enter the number up to which Fibonacci series should be printed: ");
       int limit = scanner.nextInt();

     
       int a = 0, b = 1;
       System.out.print("Fibonacci series up to " + limit + ": " + a + " " + b + " ");

       while (a + b <= limit) {
           int next = a + b;
           System.out.print(next + " ");
           a = b;
           b = next;
       }

       scanner.close();

}
}

