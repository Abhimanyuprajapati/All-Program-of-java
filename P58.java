// write a java code for the folling pattern
/*
                   * 0-1's triangle
				1
                0 1
                1 0 1
                0 1 0 1				
                1 0 1 0 1
*/
import java.util.*;
public class P58
{
	public static void main(String args[])
	{
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// outer loop
		for (int i=1;i<=n;i++)
		{
			//inner loop
			for (int j=1;j<=i;j++)
			{
			int sum=i+j;    //even no
				if (sum%2==0)
				{
					System.out.print("1 ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}	   