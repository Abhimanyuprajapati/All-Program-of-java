// write a java code finding the repeated array are present or not in arrays
//  by using function 
//   [5,1,2,3,5,,8,1,5,9]   =5
import java.util.*;
public class P80
{
	public static boolean finding(int arr[],int n)
	{
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==n)
			{
				count++;
			}
			 if (count>1)
			{
				return true;
			} 
		}
		return false;
	}
	public static void main(String args[])
	{
		int arr[]={5,54,25,12,25,54,5,99};
		System.out.println("repeated ="+finding(arr,5));
		
	}
}