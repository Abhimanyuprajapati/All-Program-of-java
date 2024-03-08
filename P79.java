// write a java code finding the Span of the array
//  by using function 
//       [45,21,45,62,2,6]  span of arrays=max-min
//                                    span =62-2
//                                    span=60
import java.util.*;
public class P79
{
	public static int Span(int arr[])
	{
		int min=arr[0];
		int max=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			/* if(arr[i]<min&&arr[i]>max)
			{
				max=arr[i];
				min=arr[i];
			} */
			if(arr[i]<min)
			{
					min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max-min;
	}
	public static void main(String args[])
	{
		int arr[]={54,25,12,25,35,99};
		System.out.println("SPAN= "+Span(arr));
		
	}
}