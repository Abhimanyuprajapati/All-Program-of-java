// take value of length and breadth of a rectangle from user and check if it is a square or not
import java.util.*;
public class P29
{
	public static void main(String args[])
	{
		System.out.print("we have to check weather a given no is square or not\n ");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a length");
		int length=sc.nextInt();
		System.out.println("enter a breadth");
		int breadth=sc.nextInt();
		if(length==breadth)
		{
			System.out.println("it is square");
		}
		else
		{
			System.out.println("it is not a square");
		}
		

	}
}