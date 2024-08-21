package numberprogram;
import java.util.*;
public class ReverseFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int number = sc.nextInt();
	        sc.close();
	        
	        int reversedNumber = reverseNumber(number);
	        System.out.println("Reversed Number: " + reversedNumber);
	    }

	    public static int reverseNumber(int number) {
	        int rev = 0;
	        while (number > 0) {
	            int lastDigit = number % 10;
	            rev = rev * 10 + lastDigit;
	            number /= 10;
	        }
	        return rev;
	    }
	}


