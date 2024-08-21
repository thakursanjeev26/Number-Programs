package numberprogram;
import java.util.*;
public class FibonacciTillNfun {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the term number (N):");
	        int number = sc.nextInt();
	        sc.close();
	        
	        int nthTerm = findNthFibonacciTerm(number);
	        System.out.println(number + "th term of Fibonacci is: " + nthTerm);
	    }

	    public static int findNthFibonacciTerm(int number) {
	        int a = 0, b = 1;
	        
	        if (number == 0) {
	            return a;
	        }
	        if (number == 1) {
	            return b;
	        }

	        for (int i = 2; i <= number; i++) {
	            int sum = a + b;
	            a = b;
	            b = sum;
	        }
	        
	        return b;
	    }
	}


