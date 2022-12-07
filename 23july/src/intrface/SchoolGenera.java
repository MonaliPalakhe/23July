package intrface;

public class SchoolGenera {
 public static void main(String[] args) {
	 EighthClass e=new EighthClass();
	 NinthClass n=new NinthClass();
	 TenthClass t=new TenthClass();
	 System.out.println("---->Eighth class Information<----");
	 e.syallabus();
	 e.fees();
	 e.exam();
	 System.out.println("---->Ninth Class Information<----");
	 n.syallabus();
	 n.fees();
	 n.exam();
	 System.out.println("---->Tenth Class Information<----");
	 t.syallabus();
	 t.fees();
	 t.exam();
}
}
