package Junits;

public class Ispalindrome {
	
	//String str1="MADAM";
	
	
	public static boolean Verify_palindrome(String str)
	{
		String str2="";
		boolean flag;
		//System.out.println(str);
		for (int i=str.length()-1;i>=0;i--)
		{
			 
			str2=str2+str.toLowerCase().charAt(i);
		}
		
		System.out.println("Reverse string is=" +str2);
		
		if (str.equalsIgnoreCase(str2))
			flag=true;
		else flag=false;
		
		return flag;
	}
			
			
}
