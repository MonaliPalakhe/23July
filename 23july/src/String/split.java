package String;

public class split {
public static void main(String[] args) {
	
	String s="Velocity is best Center In Pune ";
	String [] result=s.split(" ");
	
	for(int i=0;i<result.length;i++)
	{
	 System.out.println(result[i]);	
		
	}
	
	
	System.out.println(s.trim());
}
}
