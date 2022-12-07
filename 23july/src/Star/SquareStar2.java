package Star;
public class SquareStar2 {
 public static void main(String[]args) {
	 
	  for(int i=1;i<=6;i++) //To print rows
	   {
		 for(int j=1;j<=6;j++)//To print columns
		 {
			 if(i==1||j==1||i==6||j==6)
			 {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
			 
		 }
		 System.out.println();
	   }
	 
	 
	 
 }
	
}
