package Collections;

import java.util.HashSet;

public class Hashset {
 public static void main(String[] args) {
	HashSet <Character> set=new HashSet <Character> ();
  
	  set.add('@');
	  set.add('$');
	  set.add('*');
	  set.add('%');
	  
	  //Advanced for loop
	  for(char t:set)
	  {
		System.out.println(t);  
	  }

}
	
	
	
}
