package numberprogram;
import java.util.*;
public class GreatestofTwoNumbers {
	public static int greatestoftwo(int num1, int num2) {
		if(num1>num2) {
			System.out.println(num1 + " Is Greter Than " +num2);
			return num1;
		}
		else {
			System.out.println(num2 + " Is Greater Than " +num1);
			return num2;
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter The Second number: ");
		int num2 = sc.nextInt();
		int result= greatestoftwo(num1,num2);
		sc.close();
		System.out.println(result);
		
	}
}
