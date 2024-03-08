// write a java code for the folling pattern
/*
       12345
       1234
       123
       12
	   1
      
*/
import java.util.*;
public class P56
{
	public static void main(String args[])
	{
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		// outer loop
		for (int i=n;i>=1;i--)
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