package polymorphism;
class kids{
	public void cloths() {
		System.out.println("Kids Cloths Section.");
	}
	public void footware() {
		System.out.println("Kids footware Section.");
	}
}
class Men extends kids{
	public void cloths() {
		System.out.println("Men's Cloths Section.");
	}
	public void footware() {
		System.out.println("Men's footware Section.");
	}
}
class women extends Men{
	public void cloths() {
		System.out.println("Women's Cloths Section.");
	}
	public void footware() {
		System.out.println("Women's Footware Section.");
	}
}
public class flipkart {
	public static void main(String[] args) {
     women w=new women();
     w.cloths();
     w.footware();
}
}