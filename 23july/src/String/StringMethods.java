package String;

public class StringMethods {
	public static void main(String[] args) {
		
	
   String a="velocity";
   String b="VELOCITY";
   String c="city";
   
   System.out.println(a.replace("e", "tata"));
   System.out.println(b.isEmpty());
   System.out.println(c.concat(a));
   System.out.println(b.substring(2,7));
   System.out.println(a.substring(5));
   System.out.println(a.endsWith("y"));
   System.out.println(a.startsWith("e"));
   System.out.println(a.lastIndexOf("e"));
   System.out.println(a.indexOf("e"));
   System.out.println(a.charAt(4));
   System.out.println(a.contains(c));
   System.out.println(a.equals(c));
   System.out.println(a.equalsIgnoreCase(b));
   System.out.println(b.toLowerCase());
   System.out.println(a.toUpperCase());
   System.out.println(a==b);
   
   String s=String.join(a,b,c);//a joins b and c
   System.out.println(s);
 //  System.out.println(a.trim());
   //System.out.println(a.split(a));
   
   
	
	
	
	}
}
