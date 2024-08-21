package numberprogram;
import java.util.*;
public class PerfectNumFun {

	    public static boolean isPerfectNumber(int num) {
	        int sum = 0;
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == num;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        sc.close();

	        if (isPerfectNumber(num)) {
	            System.out.println(num + " is a perfect number");
	        } else {
	            System.out.println(num + " is not a perfect number");
	        }
	    }
	}


