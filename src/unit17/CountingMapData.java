package unit17;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class CountingMapData extends AbstractMap<Integer, String> {

	private int size;
	private static String[] chars = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z".split(" ");
	
	public CountingMapData(int size) {
		if(size < 0) 
			this.size = 0;
		else 
			this.size = size; 
	}
	
	public static class Entry implements Map.Entry<Integer, String> {
		int index;
		
		public Entry(int index) {
			this.index = index;
		}
		
		@Override
		public Integer getKey() {
			return index;
		}

		@Override
		public String getValue() {
			return chars[index % chars.length] + Integer.toString(index / chars.length);
		}

		@Override
		public String setValue(String value) {
			throw new UnsupportedOperationException();
		}
		
		@Override
		public boolean equals(Object obj) {
			return Integer.valueOf(index).equals(obj);
		}
		
		@Override
		public int hashCode() {
			return Integer.valueOf(index).hashCode();
		}
	}
	
	public Set<Map.Entry<Integer, String>> entrySet() {
		Set<Map.Entry<Integer, String>> entries = 
				new LinkedHashSet<>();
		for(int i = 0; i < size; ++i) {
			entries.add(new Entry(i));
		}
		return entries;
	}
	
	public static void main(String[] args) {
		System.out.println(new CountingMapData(20));
	}
	
}















