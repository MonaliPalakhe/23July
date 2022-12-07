package String;
import java.util.Scanner;
public class revString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of String : ");
	String str=sc.nextLine();
	
	int str2=str.length();
	String rev="";
	for(int i=str2-1;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println("Original String is : "+str);
	System.out.println("Reverse String is : "+rev);
	sc.close();
}
}
