/*
Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.in – Indian website
*/
import java.util.*;
public class P37
{
	public static void main(String args[])
	{
		System.out.println("finding web site url");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(str.endsWith(".org"))
		{
			System.out.println("organization website");
		}
		else if(str.endsWith(".com"))
		{
			System.out.println("commercial website");
		}
		else if(str.endsWith(".in"))
		{
			System.out.println("Indian website");
		}
		else{
			System.out.println("invalid website");
		}
	}
}