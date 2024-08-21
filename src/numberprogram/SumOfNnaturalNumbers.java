package numberprogram;

import java.util.Scanner;

public class SumOfNnaturalNumbers {
	public static int sumofn(int[] numbers) {
		int sum=0;
		for(int n : numbers) {
			sum+=n;
		}
		return sum;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int[] numbers=new int[n];
		System.out.println("Enter numbers to add:");
		for(int i=0;i<n;i++) {
			numbers[i]=sc.nextInt();
		}
		sc.close();
		int result=sumofn(numbers);
		System.out.println("The sum of number is Numbers is:"+ result);
		
	}
}
