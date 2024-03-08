// write a java code for adding index number of even arrays
// like [0],[1],[2],[3],[4],[5],[6],[7]   are 0,2,4...to calculate
// the sum present number in that index
// by using function
import java.util.*;
public class P81
{
	public static int add(int arr[])     // creating a function of add.
	{
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			if (i%2==0)
			{
				sum +=arr[i];      // sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		int arr[]={45,21,23,24,26,85,69,021};
		System.out.println("hard work can beats talents");
		System.out.println("sum="+add(arr));
	}
}