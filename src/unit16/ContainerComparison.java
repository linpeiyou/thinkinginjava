package unit16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BerylliumSphere {
	private static long counter;
	private final long id = counter++;
	@Override
	public String toString() {
		return "Sphere " + id;
	}
}

public class ContainerComparison {
	
	public static void main(String[] args) {
		// 数组
		BerylliumSphere[] spheres = new BerylliumSphere[10];
		for(int i = 0; i < 5; ++i) {
			spheres[i] = new BerylliumSphere();
		}
		System.out.println(Arrays.toString(spheres));
		System.out.println(spheres[4]);
		
		// 泛型
		List<BerylliumSphere> sphereList = new ArrayList<>();
		for(int i = 0; i < 5; ++i) {
			sphereList.add(new BerylliumSphere());
		}
		System.out.println(sphereList);
		System.out.println(sphereList.get(4));
		
		// 数组
		int[] integers = { 0, 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[4]);
		
		// 泛型
		List<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
		list.add(97);
		System.out.println(list);
		System.out.println(list.get(4));
	}

}











