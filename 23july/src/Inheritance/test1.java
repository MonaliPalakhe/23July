package Inheritance;
public abstract class test1 {

	public abstract void test(); //Incomplete method
    public void demo() {
  	  System.out.println("Abstraction complete Method.");
    }
}
class Concreate extends test1{
	
	public void test() {
		System.out.println("Concrete class implemented abstract method");
	}
}
