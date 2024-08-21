package numberprogram;
import java.util.*;
public class SumOfDigitFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int number = sc.nextInt();
	        sc.close();
	        
	        int sum = calculateSumOfDigits(number);
	        System.out.println("Sum of digits of the number is: " + sum);
	    }

	    public static int calculateSumOfDigits(int number) {
	        int sum = 0;
	        while (number > 0) {
	            int lastDigit = number % 10;
	            sum += lastDigit;
	            number /= 10;
	        }
	        return sum;
	    }
	}

