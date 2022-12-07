package Star;

public class thirdQudrant {
	public static void main(String[] args) {
		 int row=6;
		 int space=row-1;
		 int star=row;
		 for(int i=1;i<=row;i++) {
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1;k<=star;k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
			 space++;
			 star--;
		 }
			
			}
}
