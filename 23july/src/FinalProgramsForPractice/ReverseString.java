package FinalProgramsForPractice;
import java.util.Scanner;
public class ReverseString {
 public static void main(String[] args) {
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the String : ");
	 String str=sc.nextLine();
	 String rev=" ";//Storing string
     int length=str.length();
     
     for(int i=length-1;i>=0;i--) 
     {
    	 
    	 rev=rev+str.charAt(i);
     }
	System.out.println("Original String is : " +str);
	System.out.println("Reverse String is :"+rev);
	 
	sc.close();
}


	
	
	
}
