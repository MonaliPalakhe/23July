package intrface;

class family implements father,son,mother{
		public void demo() {
			System.out.println("This is father Interface");
		}
		public void demo1() {
			System.out.println("This is son Interface");
		}
		public void demo2() {
			System.out.println("This is mother Interface");
		}
		
		public static void main(String[] args) {
			family f=new family();
			f.demo();
			f.demo1();
			f.demo2();
					
		}
		
		
		
	}


