/*write a java program to encrypt a grade by adding 8to it.
Decrypt it to show the correct grade */

public class P19{
    public static void main(String args[]){
		System.out.println("what i do for you");
		//encrypting the data 
		char grade='C';
		grade=(char)(grade+8);
		System.out.println(grade);
		//decrypting the data
		grade=(char)(grade-8);
		System.out.println(grade);
	}
}