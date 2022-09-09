package project1.pgm1;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madam";
		String revName="";
		for(int i=name.length()-1;i>=0;i--)
		{
			revName=revName + name.charAt(i);
		}	
		if(name.equals(revName))
			System.out.println(name +" String is a palindrome.");
		else
			System.out.println(name +" String is not a palindrome.");
		}

}
