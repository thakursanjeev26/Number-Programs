
package numberprogram;
import java.util.*;
public class FactorialFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = sc.nextInt();
	        sc.close();

	        int factorial = calculateFactorial(number);
	        System.out.println("Factorial of the number is: " + factorial);
	    }

	    public static int calculateFactorial(int number) {
	        int fact = 1;

	        for (int i = 1; i <= number; i++) {
	            fact *= i;
	        }

	        return fact;
	    }
	}


