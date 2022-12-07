package Collections;

import java.util.HashSet;

public class HashSetInt {
	public static void main(String[] args) {
		HashSet <Integer> set=new HashSet <Integer> ();
	  
		  set.add(45);
		  set.add(56);
		  set.add(67);
		  set.add(89);
		  
		  //Advanced for loop
		  for(int t:set)
		  {
			System.out.println(t);  
		  }

	}
}
