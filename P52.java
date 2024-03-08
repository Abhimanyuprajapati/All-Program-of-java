// write a java code for following pattern
/*
              *
			 *
            *
           *
          *
*/
import java.util.*;
public class P52
{
	public static void main(String args[])
	{
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=1;i<=a;i++)
		{
			for (int j=1;j<=a;j++)
			{
				// System.out.print(" *");
				if(i+j==a+1)
				{
					System.out.print(" *");
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