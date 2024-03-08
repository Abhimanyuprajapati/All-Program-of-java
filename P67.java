// write a all even number falls under 1 to n... number
// 1
import java.util.*;
public class P67
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
} 