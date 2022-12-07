package polymorphism;

public class polymorphism {

	public static void Addition(int a,int b) {
		System.out.println(a+b);
	}
	public static void Addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	public static void main (String []args) {
		polymorphism.Addition(30, 50);
		polymorphism.Addition(40, 50,20);
	}
	
}
