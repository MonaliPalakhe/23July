package String;
import java.util.Scanner;
public class DuplicateCharScanner {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String : ");
	String str=sc.nextLine();
	int count;
	char string[]=str.toCharArray();
	System.out.println("Duplicate char in Given String : ");
	for(int i=0;i<str.length();i++) 
	{
		count=1;
		for(int j=i+1;j<str.length();j++) 
		  {
			if(string[i]==string[j] && string[i]!=' ') {
				count++;
				string[j]=0;
			}
		  }
		if(count>1 && string[i]!=' ')
		{
			System.out.println(string[i]);
		}
	}
sc.close();
}
}
