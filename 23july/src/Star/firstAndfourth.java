package Star;
public class firstAndfourth {
   public static void main(String[] args) {
	int row=9;
	int space=row-1;
	int star=1;
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=space;j++)
		{
		System.out.print("");
		}
		for(int k=1;k<=star;k++) 
		{
			System.out.print("*");
		}
		System.out.println();
		if(i<=row/2) 
		{
			space--;
			star++;
		}
		else {
			space++;
			star--;
		}
	}
}
}
