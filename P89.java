// Write a function to print the sum of all odd numbers from 1 to n.
// void is used to simply return nothing 
import java.util.*;
public class P89
{
	public static int display(int n)   //creating the function call by value
	{
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			if (i%2!=0)
			{
				sum=sum + i;
				System.out.println(i);  
				//System.out.println();
			}
		}
		System.out.println("sum of all odd numbers="+sum);
		return sum;
	}
	public static void main(String args[])
	{
		System.out.println("enter the no to print all sum of all add no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		display(a);     // call the function  call by value
		
	}
}