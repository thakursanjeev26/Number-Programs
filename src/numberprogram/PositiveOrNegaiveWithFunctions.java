package numberprogram;
import java.util.Scanner;
public class PositiveOrNegaiveWithFunctions {
	
	public static void PositiveOrNegative(int num) {
		if(num>0) {
			System.out.println(num+" Is Positive.");
		}else {
			System.out.println(num+" Entered NUmber is Negative.");
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number to check Whether it is positive or nrgative:");
		int num = sc.nextInt();
		sc.close();
		PositiveOrNegative(num);
	}
}
