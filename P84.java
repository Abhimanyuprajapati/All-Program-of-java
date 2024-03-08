//write a program of zig zag pattern of 2D arrays
/*   1   2   3            
     4   5   6            
	 7   8   9        =1 2 3 6 5 4 7 8 9 12 11 10     
	 10  11  12
	                   in this formate 
*/
import java.util.*;
public class P84
{
	public static void display(int arr[][])
	{
	    //first print even row
        for (int row=0;row<arr.length;row++)
		{
			if (row%2==0)   // even row
			{
				for (int col=0;col<arr[row].length;col++)
				{
					System.out.print(arr[row][col]+" ");
				}
			}
			else
			{
				// odd row
				for (int col=arr[row].length-1;col>=0;col--)
				{
					System.out.print(arr[row][col]+" ");
				}
			}
		}			
	}
	public static void main(String args[])
	{
		System.out.println("life is full of hardwork ");
		int arr[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		display(arr);
	}
}