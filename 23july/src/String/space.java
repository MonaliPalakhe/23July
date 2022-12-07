package String;

public class space {
public static void main(String[] args) {
	String a="Velocity is Best Training Institute.";
	
	int count=0;
	for(int i=0;i<a.length()-1;i++) {
		char s1=a.charAt(i);
		 if(s1==' ') 
		 {
			 count++;
		 }
		 
	}
	System.out.println("Total Spaces are :"+count);
}
	
	
}
