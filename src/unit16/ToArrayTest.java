package unit16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class ToArrayTest {
	
	/** 自定义类型A，保存着id */
	static class A {
		int id;
		A(int id) { this.id = id; }
		@Override
		public String toString() {
			return Integer.toString(id);
		}
	}

	public static void main(String[] args) {
		Collection<A> coll = new ArrayList<>();
		coll.add(new A(1));
		coll.add(new A(3));
		coll.add(new A(5));
		coll.add(new A(7));

		// 使用 new A[0] 来确定类型
		A[] as1 = coll.toArray(new A[0]);
		A[] as2 = new A[6];
		Arrays.fill(as2, new A(999));
		A[] as3 = coll.toArray(as2);
		
		System.out.println(Arrays.toString(as1));
		System.out.println(Arrays.toString(as2));
		System.out.println(Arrays.toString(as3));
	}
	
}

















