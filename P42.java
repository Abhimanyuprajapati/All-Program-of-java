// write a program to cal culate the reverse of a no
import java.util.*;
public class P42
{
	public static void main(String args[])
	{
		System.out.println("enter the no to reverse of a no");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0,temp=0;
		while (a!=0)
		{
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		System.out.println("rev="+rev);
	}
	
}