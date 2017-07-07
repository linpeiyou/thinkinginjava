package unit16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	static class A {
		int val;
		public A(int val) {
			this.val = val;
		}
		@Override
		public String toString() {
			return Integer.toString(val);
		}
	}

	public static void main(String[] args) {
		
		A[] a1 = new A[5];
		A[] a2 = new A[8];
		
		for(int i = 0; i < a1.length; ++i) {
			a1[i] = new A(i * i);
		}
		
		System.arraycopy(a1, 0, a2, 0, a1.length);
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		a1[0].val = 888;
		a1[3].val = 999;
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}
