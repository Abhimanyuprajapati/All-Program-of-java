/* write a program of if-else statements
   decision-making statements in java are 
   * if-else
   * switch statement 
*/
import java.util.Scanner;
public class P28
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you age to check weather you are elegible or not");
		int a=sc.nextInt();
		if(a>18)
		{
			System.out.println("you are eligible");
		}
		else
		{
			System.out.println("you are not eligible");
		}
		
	}
}