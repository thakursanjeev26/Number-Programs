package numberprogram;
import java.util.Scanner;
public class SumofNautalNumbers{
	public static int SumofNatural(int num) {
		int sum=0;
		if(num==0) {
			System.out.println("Natural Number Starts From 1");
		}
		else {
			for(int i=1;i<=num;i++) {
				sum+=i;
			}
		}
		return sum;
	}
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			sc.close();
			int result=SumofNatural(num);
			if(num>0) {
				System.out.println("The Sum Of Natural NUmber is:"+result);
			}
		}
}

























