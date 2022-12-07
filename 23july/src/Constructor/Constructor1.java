package Constructor;
public class Constructor1 {
	int a;
	int b;
	int c;
	String p;
	String q;
Constructor1(int x,int y,int z){
		a=x;
		b=y;
		c=z;
	}
	Constructor1(String a,String b){
		p=a;
		q=b;
	}
	public void addition() {
		System.out.println(a+b+c);
	}
	public void st() {
		System.out.println(p);
		System.out.println(q);
	}
	public static void main(String[] args) {
		Constructor1 c=new Constructor1(12,23,10);
		c.addition();
		
		Constructor1 m=new Constructor1("Monali","Sutar");
		m.st();
	}
}
