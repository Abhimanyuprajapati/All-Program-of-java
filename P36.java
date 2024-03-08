// Write a Java program to find whether a year entered by the user is a leap year or not.
import java.util.*;
public class P36
{
	public static void main(String args[])
	{
		System.out.println("enter to check the leap year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is a not leap year");
		}
	}
}