package numberprogram;
import java.util.*;
public class PalindromeFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = sc.nextInt();
	        sc.close();

	        if (isPalindrome(number)) {
	            System.out.println("The number is a palindrome");
	        } else {
	            System.out.println("The number is not a palindrome");
	        }
	    }

	    public static boolean isPalindrome(int number) {
	        int reverse = 0;
	        int originalNumber = number;

	        while (number > 0) {
	            int lastDigit = number % 10;
	            reverse = reverse * 10 + lastDigit;
	            number /= 10;
	        }

	        return reverse == originalNumber;
	    }
	}

