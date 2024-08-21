package numberprogram;
import java.util.*;

public class PrimeNuberWithinGivenRangeFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the range:");
	        int limit = sc.nextInt();
	        sc.close();

	        if (limit < 2) {
	            System.out.println("There are no prime numbers less than 2.");
	        } else {
	            for (int i = 2; i <= limit; i++) {
	                if (isPrime(i)) {
	                    System.out.println(i + " is a prime number");
	                } else {
	                    System.out.println(i + " is not a prime number");
	                }
	            }
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num < 2) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
