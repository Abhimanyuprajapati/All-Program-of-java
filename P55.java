// write a java code for the folling pattern
/*
       1
       12
       123
       1234
       12345
*/
import java.util.*;
public class P55
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
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}	   