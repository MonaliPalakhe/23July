package intrface;

public class test1 implements Default {

	public void mart() {//Implementation of incomplete method.
		 System.out.println("test in 2nd class");
	 }

public static void main(String[] args) {
	test1 x=new test1();//object of implementation class
	test2 y=new test2();//object of implementation class
	x.mart();//incomplete method from interface
    x.dmart();//default method from interface
    y.dmart();//default method from interface
    y.mart();//incomplete method from interface

}

}
