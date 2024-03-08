//by taking user input
import java.util.Scanner;
public class P10{
	public static void main(String args[])
	{
		System.out.println("taking input from the user");
		Scanner sc=new Scanner(System.in);
		boolean b1=sc.hasNextInt();
		System.out.println(b1);
	}
}