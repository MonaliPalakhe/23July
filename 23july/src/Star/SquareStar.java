package Star;
import java.util.Scanner;
public class SquareStar {
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the row for Star Square : ");
	 int row=sc.nextInt();
	 System.out.print("Enter the column for Square : ");
	 int column=sc.nextInt();
	 
	  for(int i=1;i<=row;i++) 
	  {
		  for(int j=1;j<=column;j++) {
		  if(i==row||i==1||j==1||j==column)
		  {
			  System.out.print("*");
		  }
		  else {
			  System.out.print(" ");
		  }
		  
		  }
		  System.out.println();
		  }
	 sc.close();
 }
}

