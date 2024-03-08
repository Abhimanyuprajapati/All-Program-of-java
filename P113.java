// find the product of all the arrays

import java.util.*;


public class P113{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for (int ti=0; ti<t; ti++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int pro=1;
			for (int i=0; i<n; i++)
			{
				arr[i]=sc.nextInt();
				pro=pro*arr[i];
			}
			System.out.println("product is = "+pro);
			
			
		}
	}
}