// write a program of finding the largest arrays
import java.util.*;
import java.util.Scanner;
public class P111
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("after the sum");
		for (int j=0;j<n;j++)
		{
			if(arr[j]>sum)
			{
				sum=arr[j];
			}
		}
		System.out.println("sum="+sum);
	}
}