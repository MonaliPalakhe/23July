package Collections;

import java.util.HashSet;

public class HashSetString {
	public static void main(String[] args) {
		HashSet <String> set=new HashSet <String> ();
	  

    set.add("Monali");
    set.add("Radhika");
    set.add("Sakshi");
    set.add("Priti");
    
		  //Advanced for loop
		  for(String t:set)
		  {
			System.out.println(t);  
		  }

	}
}
