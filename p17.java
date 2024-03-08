//prints your name 1000 times with out using any loop
import java.io.*;
public class P17{
    public static void main(String args[])
	{
	String s1="abhimanyu\n";
	String s2=s1+s1;
	//System.out.println(s2);
	String s3=s1+s1+s1;
	String s10=s3+s3+s3+s1;
	String s30=s10+s10+s10;
	String s100=s30+s30+s30+s10;
	String s500=s100+s100+s100+s100+s100;
	String s1000=s500+s500;
	System.out.println(s1000);
	}
}