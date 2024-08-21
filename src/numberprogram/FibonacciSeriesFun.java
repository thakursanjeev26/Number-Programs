package numberprogram;
import java.util.*;
public class FibonacciSeriesFun {


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of terms:");
	        int number = sc.nextInt();
	        sc.close();
	        
	        printFibonacci(number);
	    }

	    public static void printFibonacci(int number) {
	        int a = 0, b = 1, count = 0;

	        System.out.println(a);
	        if (number > 1) {
	            System.out.println(b);
	        }

	        while (count < number - 2) {
	            int sum = a + b;
	            System.out.println(sum);
	            a = b;
	            b = sum;
	            count++;
	        }
	    }
	}

