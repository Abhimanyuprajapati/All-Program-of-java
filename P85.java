// write a java code for taking the input of user by using 1D arrays
// arrays by using function
import java.util.*;
public class P85
{
	 public static void display(int arr[])       // now it is also working 
	{
			for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}                                          
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int n=sc.nextInt();                       // success
		int arr[]=new int [n];
		for (int i=0;i<arr.length;i++)
		{
               arr[i]=sc.nextInt();
	    }/* 
				for (int j=0;j<arr.length;j++)
				{
		
			System.out.println(arr[j]);
		        } */
			display(arr);
		
	}
}
