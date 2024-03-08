// write a java code for adding index number of odd arrays
// like [0],[1],[2],[3],[4],[5],[6],[7]   are 1,3,5...to calculate
// the sum present number in that index
// by using function
import java.util.*;
public class P82
{
	public static int add(int arr[])     // creating a function of add.
	{
		int sum=0;
		// for (int i=0;i<arr.length;i++)
			for (int i=1;i<arr.length;i+=2)
		{
			// if (i%2==1)              // or we can do in for loop
			{                    // for (int i=0;i<arr.length;i+=1)
				sum +=arr[i];      // sum=sum+i;
			System.out.println(sum);
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		int arr[]={45,21,23,24,26,85,69,21};
		System.out.println("hard work can beats talents");
		System.out.println("sum="+add(arr));
	}
}