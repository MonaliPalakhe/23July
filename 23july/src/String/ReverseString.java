package String;
import java.util.Scanner;
public class ReverseString {
   public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String : ");
	 String str=sc.nextLine();
	 String reverseStr="";
	 for(int i=str.length()-1;i>=0;i--) 
	 {
		 reverseStr=reverseStr+str.charAt(i);
	 }
	 System.out.println("Original String : "+str);
	 System.out.println("Reverse String Is : "+reverseStr);
	sc.close(); 
 }
	 
}
