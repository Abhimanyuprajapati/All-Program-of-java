//  write the program of array simple use

import java.util.*;
public class P61
{
	public static void main(String args[])
	{
		System.out.println("simple example of array ");
		//who it work and different style of printing array
		int marks[]={1,2,3,4,5};
		// System.out.println(marks.length);   //marks.length:-this function is used to give 
		                                    // //the total array in marks
											
											
		// //we can also use like this									
		// System.out.println(marks[0]);
		// System.out.println(marks[1]);	
		// System.out.println(marks[2]);
		// System.out.println(marks[3]);
		// System.out.println(marks[4]);
		
		// //we can also write this code by using for loop
		// for (int i=0;i<=marks.length;i++)
		// {
			// System.out.println(marks[i]);
		// }
		
		
		// //display the array in reverse order
		// for (int i= marks.length-1;i>=0;i--)
		// {
			// System.out.println(marks[i]);
		// }
		
		// display the array for each-loop
		for (int element:marks)
		{
			System.out.println(element);
		}
	}
}