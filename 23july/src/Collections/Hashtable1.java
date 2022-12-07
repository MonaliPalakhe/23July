package Collections;


import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {
	public static void main(String[] args) {
		Hashtable <Integer,String> table=new Hashtable <Integer,String> ();
	  

		table.put(22, "monali");
		table.put(23, "sahil");
		table.put(24, "priti");
		table.put(82, null);
		//table.put(null, null);//NullPointerException
		table.put(28, "sakshi");
		table.put(null, "sonali");
		  
		  

 for(Map.Entry<Integer ,String> m : table.entrySet())
 {
	 System.out.println(m.getKey() +" "+m.getValue());
 }
 System.out.println("---------After Updatating key value-------");

 table.put(23, "Radhika");
 for(Map.Entry<Integer ,String> m : table.entrySet())
 {
	 System.out.println(m.getKey() +" "+m.getValue());
 }
 
 
 
 
 
	}
}
