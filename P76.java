// write a java code for finding the smallest elements in arrays 
//  by using function           
import java.util.*;
public class P76
{
	public static int min(int arr[])
	{
		//int min=54;
		int min=Integer.MAX_VALUE; 
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String args[])
	{
		int arr[]={54,25,12,25,35,99};
		System.out.println("arrays ="+min(arr));
	}
}