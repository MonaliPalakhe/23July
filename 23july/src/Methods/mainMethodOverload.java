package Methods;

public class mainMethodOverload {
	public static void main(int a) {
   	 System.out.println(a);
    }
    public static void main(char m) {
   	 System.out.println(m);
    }
    public static void main(String[] args) {
   	 main(27);
   	 main('A');
    }

}
