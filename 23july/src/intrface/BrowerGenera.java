package intrface;

public class BrowerGenera {
	public static void main(String[] args) {
	fireFox f=new fireFox();
	GoogleCrome g=new GoogleCrome();
	InternetExplorar i=new InternetExplorar();
	opera o=new opera();
	
	System.out.println("-->FireFox<--");
	f.Download();
	f.install();
	f.name();
	f.owner();
	f.update();
	System.out.println("-->GoogleCrome<--");
	g.Download();
	g.install();
	g.name();
	g.owner();
	g.update();
	System.out.println("-->InternetExplorar<--");
	i.Download();
	i.install();
	i.name();
	i.owner();
	i.update();
	System.out.println("-->opera<--");
	o.Download();
	o.name();
	o.owner();
	o.update();
	o.install();
	
	
	
	
	
}
}