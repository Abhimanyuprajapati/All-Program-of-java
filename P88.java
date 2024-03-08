// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class P88
{
	public static int average(int sum)
	{
		int average=sum/3;
		System.out.println("average ="+average );
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println("Enter a no to fint the average");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		int a=sc.nextInt();
		System.out.println("enter the second no");
		int b=sc.nextInt();
		System.out.println("enter the third no");
		int c=sc.nextInt();
		int sum=a+b+c;
		System.out.println("sum ="+sum );
		average(sum);

	}
}