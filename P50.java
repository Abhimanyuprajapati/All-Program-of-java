// write the java code for following patterns given below 
/*
          * * * * *
		   * * * *
		    * * *
			 * *
			  *
*/
import java.util.*;
public class P50
{
	public static void main(String args[])
	{
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=1;i<=a;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			 for (int k=a;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}