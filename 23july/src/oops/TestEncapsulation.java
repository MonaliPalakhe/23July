package oops;

public class TestEncapsulation extends Encapsulation {
 
	public static void main(String[] args) {
		TestEncapsulation x=new TestEncapsulation();//super class reference object
	x.test();
	Encapsulation y=new Encapsulation();
	y.test();//zero parameter constructor
	
//	Encapsulation z=new Encapsulation(50,50);
	//z.test();//parameterizes constructor not achive Encapsulation.
	

}
}
