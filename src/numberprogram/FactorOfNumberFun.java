package numberprogram;
import java.util.*;
public class FactorOfNumberFun {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        sc.close();
	        
	        printFactors(num);
	    }

	    public static void printFactors(int num) {
	        for (int divisor = 1; divisor <= num; divisor++) {
	            if (num % divisor == 0) {
	                System.out.println(divisor);
	            }
	        }
	    }
	}

