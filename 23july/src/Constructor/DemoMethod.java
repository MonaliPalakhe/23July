package Constructor;
public class DemoMethod {
	int a ;
	int b;
	int m;
	String name;
	String add;
	DemoMethod(){ // user define cons with  zero argument / parameter
		 a = 89;
		 b =90;
	}
    DemoMethod(int c , int d){ // user define cons with  Argument / Parameter
		a=c;
		b=d;
	}
	DemoMethod(int c ,int d, int i){ // user define cons with  Argument / Parameter
		a=c;
		b=d;
		m=i;	
		}
	DemoMethod(String nm,String vs){// user define cons with  Argument / Parameter
	name =nm;
	add =vs;
}
	public void addition() {
		System.out.println(m+a+b);
	}
	public void St() {
		System.out.println(name);
		System.out.println(add);
	}
	public static void main(String[] args) {
		DemoMethod x = new DemoMethod();
		x.addition();
		DemoMethod y = new DemoMethod(70,80,90);
		y.addition();
		DemoMethod z = new DemoMethod(70,80);
		z.addition();
		DemoMethod s = new DemoMethod("Monali","Tester");
		s.St();	
	}

}
