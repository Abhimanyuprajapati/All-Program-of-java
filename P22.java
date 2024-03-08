//write a program of all string function
/*string are immutable and can not change */
public class P22
{
	public static void main(String args[])
	{
		String name;
	//	name="abhimanyu";
		name="abhimanyu you need to hard work";
		System.out.println(name);
		String n1="abhimanyu you can do it";
		System.out.println(n1);
		String n2;
    	n2=new String("Abhimanyu try");
		System.out.println(n2);
		name.length();
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		System.out.println(name.substring(5));
		System.out.println(name.substring(2,8));
		System.out.println(name.replace('a','z'));
		System.out.println(name.startsWith("a"));
		System.out.println(name.endsWith("u"));
	    System.out.println(name.charAt(5));
	}	
}