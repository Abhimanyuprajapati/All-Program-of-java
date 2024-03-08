// another method of printing this pattern
/*
         *
		  *
		   *
		    * 
			 *
*/			 
		 
import java.util.*;
public class P59
{
	public static void main(String args[])
	{
		int n=5;
		int m=4;
		// outer loop
		for (int i=1;i<=n;i++)
		{
			// inner loop
			for (int j=1;j<=m;j++)
			{
				if (i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
} 
