package numberprogram;
import java.util.*;

public class PrimeNumberFunction {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter The Number:");
	        int num = sc.nextInt();
	        sc.close();
	        
	        if (isPrime(num)) {
	            System.out.println(num + " is a Prime Number");
	        } else {
	            System.out.println(num + " is Not a Prime Number");
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


