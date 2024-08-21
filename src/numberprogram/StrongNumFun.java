package numberprogram;
import java.util.*;
public class StrongNumFun {	    
	    public static int factorial(int digit) {
	        int fact = 1;
	        for (int i = 1; i <= digit; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	    public static boolean isStrongNumber(int num) {
	        int original_num = num;
	        int sum = 0;
	        while (num > 0) {
	            int digit = num % 10;
	            sum += factorial(digit);
	            num = num / 10;
	        }
	        return sum == original_num;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        sc.close();
	        
	        if (isStrongNumber(num)) {
	            System.out.println(num + " is a strong number");
	        } else {
	            System.out.println(num + " is not a strong number");
	        }
	    }
	}


