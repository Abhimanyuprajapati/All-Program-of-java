// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
/*
Greatest Common Divisor: It is the highest number that completely divides two or more numbers. 
It is abbreviated for GCD. It is also known as the Greatest Common Factor (GCF) and 
the Highest Common Factor (HCF).
It is used to simplify the fractions.
        a=50    b=60   =1,2,5,10
		HCF/GCD/GCF=10
*/

import java.util.*;
public class P96
{
	//public static int display(int n,int p)  // creating the function
	public static void display(int n,int p) 
	{
		//int g;
		/* for(int i=1;i<=n;i++)
		{
			int g=0;                 output is not comming
			if(n%i==0&&p%i==0)
			{
				g=i;
			}
			//return g;
		}
		return 0; */
		int g=0;     
	    for(int i=1;i<=n;i++)
		{
			           
			if(n%i==0&&p%i==0)
			{
				g=i;
			}
			
		}
		System.out.println("GCF="+g);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int a=sc.nextInt();
		System.out.println("enter a no");
		int b=sc.nextInt();
		//System.out.println("GCF=" +display(a,b));
		display(a,b);
	}
}