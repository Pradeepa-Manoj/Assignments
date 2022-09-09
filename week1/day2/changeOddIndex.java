package project1.pgm1;

public class ChangeOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="changeme";
		char[] holder=value.toCharArray();
		int len=holder.length;		
		for(int i=0;i<=len; i++)
		{
			if(i>0 && (i%2==1))
			{
				holder[i]=Character.toUpperCase(holder[i]);
			}
				
		}
		System.out.println(holder);
	}

}
