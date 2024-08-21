package numberprogram;
import java.lang.Math;
import java.util.Scanner;
public class ArmstrongFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = sc.nextInt();
	        sc.close();

	        if (isArmstrong(number)) {
	            System.out.println("The given number is an Armstrong number");
	        } else {
	            System.out.println("The given number is not an Armstrong number");
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int digitCount = 0;
	        int sum = 0;
	        int temp = number;

	        // Count the number of digits
	        while (temp > 0) {
	            digitCount++;
	            temp /= 10;
	        }

	        temp = number;

	        // Calculate the sum of the powers of its digits
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digitCount);
	            temp /= 10;
	        }

	        // Check if the sum equals the original number
	        return originalNumber == sum;
	    }
	}

