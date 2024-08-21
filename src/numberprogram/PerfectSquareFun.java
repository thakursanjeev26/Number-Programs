package numberprogram;
import java.util.*;
public class PerfectSquareFun {
	    public static boolean isPerfectSquare(int num) {
	        int i = 1;
	        while (i * i <= num) {
	            if (i * i == num) {
	                return true; 
	            }
	            i++;
	        }
	        return false; 
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = sc.nextInt();
	        sc.close();

	        if (isPerfectSquare(num)) {
	            System.out.println(num + " is a perfect square");
	        } else {
	            System.out.println(num + " is not a perfect square");
	        }
	    }
	}


