package numberprogram;
import java.util.*;
public class SumofnumbersIngivenRange {
	public static int sumofn(int start_range,int end_range) {
		int sum=0;
		for(int i=start_range;i<=end_range;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Starting Range: ");
		int start_range = sc.nextInt();
		System.out.println("Enter the End Range: ");
		int end_range=sc.nextInt();
		sc.close();
		int result=sumofn(start_range,end_range);
		System.out.println("Sum of Number In a given range: "+result);
	}
	
}
