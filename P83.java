// write a java code for reverse of arrys
// [2,1,8,5,7,9,4]   reverse   [4,9,7,5,8,1,2]
// by using function
import java.util.*;
public class P83
{
	public static void reverse(int arr[])
	{
		int left=0;
		int right=arr.length-1;
	    while (left<right)
	    {
		// swap
		int temp=arr[left];
		 arr[left]=arr[right];
		 arr[right]=temp;
		 left++;
		 right--;
	    }
	}
	public static void display(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int arr[]={45,21,23,24,26,85,69,21};
		System.out.println("hard work can beats talents");
		// int a=reverse(arr);
		//System.out.println(reverse(arr));
		display(arr);
		reverse(arr);
		display(arr);
	}
}