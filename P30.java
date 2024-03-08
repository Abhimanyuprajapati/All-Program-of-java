// write a program to find the greater of three no
import java.util.Scanner;
public class P30
{
	public static void main(String args[])
	{
		System.out.println("enter three no");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if (a>b&&a>c)                             //
		{
		    System.out.println("A is greater no");	
		}
		else if(b>a&&b>c)
		{
			System.out.println("B is greater no");	
		}
		else
		{
			System.out.println("C is greater no");	
		}
	}
}