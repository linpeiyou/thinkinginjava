package unit17;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SlowMap<K, V> extends AbstractMap<K, V> {

	private List<K> keys = new ArrayList<>();
	private List<V> values = new ArrayList<>();
	
	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> set = new HashSet<>();
		Iterator<K> ki = keys.iterator();
		Iterator<V> vi = values.iterator();
		while(ki.hasNext()) {
			set.add(new MapEntry<K, V>(ki.next(), vi.next()));
		}
		return set;
	}
	
	@Override
	public V get(Object key) {
		if(!keys.contains(key))
			return null;
		return values.get(keys.indexOf(key));
	}
	
	@Override
	public V put(K key, V value) {
		V oldValue = get(key);
		if(oldValue == null) {
			keys.add(key);
			values.add(value);
		}
		else {
			values.set(keys.indexOf(key), value);
		}
		return oldValue;
	}
	
	static class MapEntry<K, V> implements Map.Entry<K, V> {
		private K key;
		private V value;
		public MapEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		@Override
		public V setValue(V value) {
			V oldValue = this.value;
			this.value = value;
			return oldValue;
		}
		
		@Override
		public int hashCode() {
			return (key == null ? 0 : key.hashCode()) ^
					(value == null ? 0 : value.hashCode());
		}
		
		@Override
		public boolean equals(Object obj) {
			if(!(obj instanceof MapEntry))
				return false;
			MapEntry me = (MapEntry) obj;
			return (key == null ? me.getKey() == null : key.equals(me.getKey())) &&
					(value == null ? me.getValue() == null : value.equals(me.getValue()));
		}
		
		@Override
		public String toString() {
			return key + "=" + value;
		}
	}
	
	public static void main(String[] args) {
		SlowMap<String, String> m = new SlowMap<>();
		m.put("lin", "hahaha");
		m.put("pei", "gegegeg");
		m.put("you", "wawa");
		m.put("pey", "yaha");
		System.out.println(m);
		System.out.println(m.get("pei"));
		System.out.println(m.entrySet());
	}

}












