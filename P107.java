// write a simple program of string to take simple charater from it
//               (a b h i m a n y u)
//                0 1 2 3 4 5 6 7 8     indexing of a charater
//         what is at 5th position is "a"

import java.util.*;
import java.util.Scanner;
public class P107
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	//	String str=sc.nextLine();
		
		//int b=sc.nextInt();
		/* char a=str.charAt(5);
		System.out.println(str);
		System.out.println(str); */
		
		// converting the string to integer
		String p="256";
		int m=Integer.parseInt(p);
		System.out.println(m);
		
		// converting the integer into string
		int a=120;
		String aa=Integer.toString(a);
		System.out.println(aa);
		
		int c=m+a;
		System.out.println("a is "+c);
	}
}