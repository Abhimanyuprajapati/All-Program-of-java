// find the sum of all the arrays

import java.util.*;


public class P112{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int ti=0; ti<t; ti++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int sum=0;
			for (int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
			}
			System.out.println("sum is = "+sum);
			System.out.println();
			System.out.println();
		}
	}
}