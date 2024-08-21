package numberprogram;
import java.util.*;
public class GreatestofThreeNumbers {
	public static int greatestofthree(int num1,int num2,int num3) {
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " Is Greater than " + num2 + " , " + num3);
			return num1;
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " Is Greater than " + num1 + " , " + num3);
			return num2;
		}
		else {
			System.out.println(num3+" Is Greater than "+num1+" , " +num2);
			return num3;
		}
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Number :");
		int num1=sc.nextInt();
		System.out.println("Enter The Second Number :");
		int num2=sc.nextInt();
		System.out.println("Enter The Third Number :");
		int num3=sc.nextInt();
		sc.close();
		int result=greatestofthree(num1,num2,num3);
		System.out.println(result);
		
	}
}
