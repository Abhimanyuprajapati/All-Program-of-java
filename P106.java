/*
Problem Statement
Given an integer N, you have to print the given below pattern for N >= 3.

                Pattern for N = 4:-
						*
						*^*
						*^^*
						*****
*/
import java.util.*;
public class P106
{
	public static void main(String args[])
	{
		System.out.println("hard work");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		display(N);
	}
	
	
	public static void display(int N)
	{
		// inner row
		System.out.println("* ");
		
		// middle row
		for (int i=2;i<N;i++)
		{
			System.out.print("*");
			for (int j=1;j<i;j++)
			{
				System.out.print("^");
			}
			System.out.println("*");
		}
		
		// last row
		for (int i=1;i<=N+1;i++)
		{
			System.out.print("*");
		}
	}
}