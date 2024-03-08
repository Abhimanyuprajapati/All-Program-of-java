// write a java code for the folling pattern
/*
                   * Floyd's triangle
				1
                2 3
                4 5 6
                7 8 9 10				
                11 12 13 15
*/
import java.util.*;
public class P57
{
	public static void main(String args[])
	{
		System.out.println("enter a no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=1;
		// outer loop
		for (int i=1;i<=n;i++)
		{
			//inner loop
			for (int j=1;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;     // number = number+1;
			}
			System.out.println();
		}
	}
}	   