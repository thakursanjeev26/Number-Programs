package numberprogram;
import java.lang.Math;
import java.util.Scanner;

public class ArmstrongWithGivenRange {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a starting range:");
	        int start = sc.nextInt();
	        System.out.println("Enter an ending range: ");
	        int end = sc.nextInt();
	        sc.close();

	        for (int i = start; i <= end; i++) {
	            if (isArmstrong(i)) {
	                System.out.println(i + " is an Armstrong number");
	            } else {
	                System.out.println(i + " is not an Armstrong number");
	            }
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int temp = number;
	        int sum = 0;
	        int digitCount = countDigits(number);

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digitCount);
	            temp /= 10;
	        }

	        return sum == number;
	    }

	    public static int countDigits(int number) {
	        int digitCount = 0;
	        while (number > 0) {
	            digitCount++;
	            number /= 10;
	        }
	        return digitCount;
	    }
	}

