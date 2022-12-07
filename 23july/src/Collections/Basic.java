package Collections;

import java.util.ArrayList;

public class Basic {
	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		list.add(1234);
		list.add("Welcome To Monali's World");
		list.add(23.24);
		list.add("#");
		
		int size = list.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("-----------Remove/delete data---------");
		list.remove(2);
		int size2 = list.size();
		System.out.println(size2);
		for(int i=0;i<size2;i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
