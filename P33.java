/* Write a program to find out whether a student is pass or fail
 if it requires a total of 40% and at least 33% in each subject to pass.
 Assume 3 subjects and take marks as input from the user.
 */
import java.util.Scanner;
public class P33
{
	public static void main(String args[])
	{
		System.out.println("Enter a your marks");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your biology marks");		
	    byte m1=sc.nextByte();
		System.out.println("enter your physics marks");
		byte m2=sc.nextByte();
		System.out.println("enter your chemestry marks");
	    byte m3=sc.nextByte();
		float f1=(m1+m2+m3)/3.0f;
		System.out.println("average="+f1);
		if(f1>=33&& m1>33&&m2>33&&m3>33)
		{
			System.out.println("pass");
		}
		  else
		  {
			  System.out.println("fail");
		  }
		  
		
	}
}