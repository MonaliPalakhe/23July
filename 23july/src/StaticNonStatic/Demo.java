package StaticNonStatic;
public class Demo {
	static int a=20;
	int b=10;
	public static void main(String[] args) {
		System.out.println("Static Variable :"+a);
		Demo x=new Demo();
		System.out.println("Non static variable call with ref varible x :"+x.b);      
		Demo y=new Demo();
		System.out.println("Non static variable call with ref varible y :"+y.b);

        x.b=45;
        System.out.println("Non static variable call with ref varible x :"+x.b);
        System.out.println("Non static variable call with ref varible y :"+y.b);
        x.a=60;
        System.out.println("Non static variable call with ref varible x updated :"+x.a);
        System.out.println("Non static variable call with ref varible y updated :"+y.a);
        
        

	}

}
