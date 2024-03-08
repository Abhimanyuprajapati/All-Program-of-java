// write a all odd number falls under 1 to n... number 
// by using while loop 
// 1,3,5,7,9,11,13,15,........n
import java.util.*;
public class P69
{
	public static void main(String args[])
	{
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
        int i=1;
		while (i<=a)
		{
		//	System.out.println("you will see this");
		if (i%2!=0)
		{
			System.out.println(i);
		}
			i++;
		}
		
	}
} 