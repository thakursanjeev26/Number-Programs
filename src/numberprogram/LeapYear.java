package numberprogram;
import java.util.*;
public class LeapYear {
	public static int leapyaer(int year) {
		if(year<=1582) {
			System.out.println("the Gregorian calendar starts from 1582");
			return year;
		}
		else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println("the year is leap year");
			return year;
		}else {
			System.out.println("the year is not a leap year");
			return year;
		}
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Year:");
		int year = sc.nextInt();
		sc.close();
		int result=leapyaer(year);
		System.out.println(result);
	}
}
