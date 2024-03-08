/* 
Write a function that takes in age as input and returns if that person is eligible to vote or not.
A person of age > 18 is eligible to vote.
*/
import java.util.*;
public class P92
{
	public static void display()   //call by method and it will not return any things so 
	                         // not to write return at last
	{
	    Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("you are eligible to vote");
		}
		else
		{
			System.out.println("you are not eligible to vote");
		}
	}
	public static void main(String args[])
	{
		System.out.println("enter your age ");
		display();// call by method
	}
}