// write the 2-D array program simply display
/*[4][4]=[16]
                 col   col   col  col
				 0      1    2     3
            row [0,0] [0,1] [0,2] [0,3]    0
            row [1,0] [1,1] [1,2] [1,3]    1
		    row	[2,0] [2,1] [2,2] [2,3]    2
            row [3,0] [3,1] [3,2] [3,3]    3
*/
import java.util.*;
public class P63
{
	public static void display(int arr[][])
	{
		// this loop will run for all row
		for (int row=0;row<arr.length;row++)
		{
			// printing first row 
			for (int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col]+" ");
			}
			// printing empty line after each row
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		System.out.println("enter to print 2-D array");
		int arr[][]={{1,2,3,4},{5,8,6,2},{11,12,13,14},{21,82,53,64}};
	    display(arr);
		
	}
	
}