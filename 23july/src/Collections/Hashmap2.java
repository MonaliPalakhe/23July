package Collections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap2 {

	
	public static void main(String[] args) {
		HashMap <Integer,String> map=new HashMap <Integer,String> ();
	  

 map.put(22, "monali");
 map.put(23, "sahil");
 map.put(24, "priti");
 map.put(82, null);
 map.put(null, null);
 map.put(null, "sakshi");
 map.put(null, "sonali");
		  
		  

 for(Map.Entry<Integer ,String> m : map.entrySet())
 {
	 System.out.println(m.getKey() +" "+m.getValue());
 }
 System.out.println("---------After Updatating key value-------");

 map.put(23, "Radhika");
 for(Map.Entry<Integer ,String> m : map.entrySet())
 {
	 System.out.println(m.getKey() +" "+m.getValue());
 }
 
 
 
 
 
	}
}
