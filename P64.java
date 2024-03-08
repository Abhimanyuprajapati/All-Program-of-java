// write a java code by using function
import java.util.*;
public class P64
{
	public static void myname(String name)
	{
		System.out.println(name);
		return;
	}
	
	public static void main(String args[])
	{
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		myname(a);
		
	}
} 