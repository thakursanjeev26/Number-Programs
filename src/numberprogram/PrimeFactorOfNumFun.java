package numberprogram;
import java.util.*;
public class PrimeFactorOfNumFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        sc.close();
	        
	        findPrimeFactors(num);
	    }

	    public static void findPrimeFactors(int num) {
	        int divisor = 2;
	        while (num > 1) {
	            if (num % divisor == 0) {
	                System.out.println(divisor);
	                num = num / divisor;
	            } else {
	                divisor++;
	            }
	        }
	    }
	}


