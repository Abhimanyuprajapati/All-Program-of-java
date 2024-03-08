// write a java code for taking input from array  and printing them

import java .util.Scanner;
public class P73
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no of array");
		int a=sc.nextInt();
		int arr[]=new int[a];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int j=0;j<arr.length;j++)
		{
		    System.out.println("arrays="+arr[j]);
		}
	}
}