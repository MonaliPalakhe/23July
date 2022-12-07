package Condtional;
import java.util.Scanner;
public class ToprintODDno {
	 public static void main(String[]args) 
	 {
		 //Scanner class object
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Largest Odd Number : ");
		 int oddNum=sc.nextInt();
		 
		 for(int i=1;i<=oddNum;i+=2)
		 {
			 System.out.println(i);
		 }
		 
		 sc.close();
	 }
		
}
