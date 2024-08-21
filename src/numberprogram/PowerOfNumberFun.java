package numberprogram;
import java.util.*;
import java.lang.Math;

public class PowerOfNumberFun {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the base:");
	        int base = sc.nextInt();
	        System.out.println("Enter the exponent:");
	        int exponent = sc.nextInt();
	        sc.close();

	        double result = calculatePower(base, exponent);
	        System.out.println(base + " ^ " + exponent + " is " + result);
	    }

	    public static double calculatePower(int base, int exponent) {
	        return Math.pow(base, exponent);
	    }
	}

