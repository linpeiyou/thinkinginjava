package unit16;

import java.util.Arrays;

public class ArrayOptions {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		System.out.println(arr instanceof Object);
		
		BerylliumSphere[] a;
		BerylliumSphere[] b = new BerylliumSphere[5];
		
		System.out.println(Arrays.toString(b));
		
		BerylliumSphere[] c = new BerylliumSphere[4];
		for(int i = 0; i < c.length; ++i) {
			if(c[i] == null)
				c[i] = new BerylliumSphere();
		}
		
		BerylliumSphere[] d = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };
		
		a = new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere() };
		
	}
	
	
}
