// write a program of factorial of a no
import java.util.*;
public class P31
{
	public static void main(String args[])
	{
		System.out.println("enter the no to find the factorial ");
		int n,f=1,i;
		  //int p=0;
	Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
     
		for(i=1;i<=n;i++)
		{
			f=f*i;
			System.out.println("f="+f);
		}
		System.out.println("factorial="+f);
		
	}
}	