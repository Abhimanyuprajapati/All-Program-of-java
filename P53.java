// write a program of holo square pattern
/*
             **********
			 *        *
			 *        *
			 *        *
			 *        *
			 **********
*/
import java.util.*;
public class P53
{
     public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the colums value");
		int n=sc.nextInt();
	     System.out.println("enter the rows value");
        int m=sc.nextInt();
		// outer loop of n
        for(int i=1;i<=n;i++)
		{
			//inner loop of m
			for (int j=1;j<=m;j++)
			{
				if(i==1||j==1||i==n||j==m)
				{
					System.out.print(" *");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}			
	 }
	 
}			 