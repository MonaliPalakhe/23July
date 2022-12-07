package Star;
import java.util.Scanner;
public class ForStarScannerClas {
public static void main(String[]args) 
 {
  //Scanner class object
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row and column for star :");
	int row=sc.nextInt();
	int column=sc.nextInt();
	for(int i=1;i<=row;i++)//print row of star pattern--outer for
	{
		for(int j=1;j<=column;j++)//print column of star pattern--inner for
		{
			System.out.print("*");
		}
		System.out.println();
	}

	sc.close();
	
 }
}
