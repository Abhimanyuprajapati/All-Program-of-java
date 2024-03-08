// write this pattern in java
     /* 
*
**
***
****
***
**
* 

    */
import java.util.*;
public class P45
{
	public static void main(String args[])
	{
		System.out.println("enter the no.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=a;i++)
		{
			 for (int j=a;j>i;j--)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		}
	}
}