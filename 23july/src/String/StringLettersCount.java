package String;
import java.util.Scanner;
public class StringLettersCount {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str=sc.nextLine();
	int count=0,countDigit=0;
	int spl=0;
	for(int i=0;i<str.length();i++) //string length()used here
	{
		if(Character.isDigit(str.charAt(i)))//checks digit 1 by 1
			countDigit++;
		else if(Character.isLetter(str.charAt(i)))
			count++;
		else 
			spl++;
		
		}
	System.out.println("Total Letters in String Are: " +count);
	System.out.println("Total Digits in String Are: " +countDigit);
	System.out.println("Total special character in String are : " +spl);
	sc.close();
	}
}
