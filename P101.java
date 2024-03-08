// write a java code for inverse of an arrays 

import java.util.*;
public class P101
{
 	public static int[] display(int arr[])
	{
		System.out.println("no see inverse ");
		int rev[]=new int[arr.length];
		for(int col=0;col<arr.length;col++)
		{
			rev[arr[col]]=col;
		}
		return rev;
	}
	public static void display1(int arr[])
	{
		for(int col=0;col<arr.length;col++)
		{
			System.out.print(arr[col]+"      ");
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		System.out.println("see care fully");
		int arr[]={5,2,1,3,4,6};
	display1(arr);
		display(arr);
	}
}