package Methods;

public class NonStaticDiffClass {
	public static void main(String[]args) {
	NonStaticMethod s=new NonStaticMethod();
	s.demo();//non static method call from diff class
	s.demo2();
	s.demo3();
}
}