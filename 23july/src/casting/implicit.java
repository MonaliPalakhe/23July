package casting;

public class implicit {//implicit casting.lower dataType into higher datatype
public static void main(String[] args) {
	byte a= 78;//1 byte memory size.
	System.out.println(a);
	
   int b=a;//Memory size 4 byte.
   System.out.println(b);
   
   double c=b;//memory size 8 byte
   System.out.println(c);
   
}
}
