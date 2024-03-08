//write a program of this pattern
/*
                   *****
				   *****
				   *****
				   *****
*/
import java.util.*;
public class P54
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the value or row == i");
		int n=sc.nextInt();
		System.out.println("enter the value or columns == j");
		int m=sc.nextInt();
		
		// outer loop
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=m;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
}				   