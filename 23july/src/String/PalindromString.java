package String;

public class PalindromString {
public static void main(String[] args) {
	String s="4554";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) 
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(s.equals(rev)) {
		System.out.println(s + " is palindrom.");
	}
	else 
	{
		System.out.println(s + " is not palindrom");
	}
	
	
}
}
