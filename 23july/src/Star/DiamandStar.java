package Star;

public class DiamandStar {
	public static void main(String[]args)
	{
		int space=4;
		int star=1;
		for(int i=1;i<=9;i++)//to print 9 rows
		{
			for(int j=1;j<=space;j++)//to print space in star program
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)//to print star in star program
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<=4)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
		
	}

}
