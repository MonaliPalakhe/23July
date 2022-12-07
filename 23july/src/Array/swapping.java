package Array;

import java.util.Arrays;

public class swapping {
	public static void main(String[] args) {
	int a[]= {20,24,34,65,86,50,32};
	/*System.out.println("Asceding order Array:");
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		System.out.print(" "+a[i]);
	}*/
	for(int i=0;i<(a.length)/2;i++) {
		int z;//new variable declare.
		z=a[i];
		a[i]=a[(a.length-1)];
		a[a.length-1]=z;
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(" "+a[i]);
	}
	
}}