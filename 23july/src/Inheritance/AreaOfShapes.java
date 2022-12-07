package Inheritance;
class areCircle{
	void areCircle1() {
		double areCircle=(3.14*3.0*3.0);	
		System.out.println("Area of Circle is: "+areCircle);
		}
}
class areSqure extends areCircle{
	void areSqure1() {
		double areSqure=(3.0*3.0);	
		System.out.println("Area of Squre circle is: "+areSqure);
		}
}
class areRetangle extends areSqure{
	void areRetangle1(){
		double areRetangle=0.5*2.0*5.0;
		System.out.println("Area of Rectangle : "+areRetangle);
		
	}
}
public class AreaOfShapes {
	public static void main(String[] args) {
		areRetangle area=new areRetangle();
		area.areCircle1();
		area.areSqure1();
		area.areRetangle1();
	}

}
