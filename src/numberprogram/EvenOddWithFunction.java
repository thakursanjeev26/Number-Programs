package numberprogram;

import java.util.Scanner;

public class EvenOddWithFunction {

	public static void evenorodd(int num) {
	if(num%2==0) {
		System.out.println("The Number " + num + " Is Even .");
	}
	else {
		System.out.println("The Number " + num + " Is Odd");
	}
}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Whether it is Even Or Odd:");
		int num = sc.nextInt();
		sc.close();
		evenorodd(num);	
	}
	
}
