package polymorphism;
class apple{
	public void mackBook() {
		System.out.println("MackBook version is MackBook 16");
	}
	public void mackBook(float price) {
		System.out.println("Mackbook Price is : "+price);
	}
	public void total(float total) {
		System.out.println("Total Bill for Apple Product : "+total);
	}
}
class Dell extends apple{
	public void Dell() {
		System.out.println("Dell latest version is Dell Inspiron 16");
	}
	public void Dell(float price) {
		System.out.println("Dell Laptop Price is : "+price);
	}
	public void total(float total) {
		System.out.println("Total Bill for Dell Product : "+total);}
}
public class OvLoadOvRide {
 public static void main(String[] args) {
	 Dell d=new Dell();
	 d.Dell();
	 d.Dell(70000f);
	 d.mackBook();
	 d.mackBook(225000f);
	 d.total(500000f);
}
}
