// write a program of java pattern for this.
/*
             *
              *
               *
                *
                 *
*/
import java.util.*;
public class P51
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
				// System.out.print(" *");
				if(i>=2&&j<=i-1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}	
			}
			System.out.println();
		}
	}				 
}