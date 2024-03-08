// write a java code for finding the largest elements in arrays 
//  by using function
import java.util.*;
public class P75
{
	public static int max(int arr[])
	{
		int max=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String args[])
	{
		int arr[]={54,25,12,25,35,99};
		System.out.println("arrays ="+max(arr));
	}
}