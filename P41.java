// write a program of for loop to print star pattern

import java.util.*;
public class P41
{
	public static void main(String args[])
	{
		System.out.println("star pattern");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no.");
		int a=sc.nextInt();
		for (int i=0;i<=a;i++)
		{
			for (int j=i;j<=a;j++)
			{
				System.out.println("*");
			}
		}
	}
} 