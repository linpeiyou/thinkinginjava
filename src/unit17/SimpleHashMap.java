package unit17;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import unit17.SlowMap.MapEntry;

public class SimpleHashMap<K, V> extends AbstractMap<K, V> {

	static final int SIZE = 997;
	
	@SuppressWarnings("unchecked")
	LinkedList<MapEntry<K, V>>[] buckets = new LinkedList[SIZE];
	
	@Override
	public V put(K key, V value) {
		V oldValue = null;
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null) {
			buckets[index] = new LinkedList<>();
		}
		
		LinkedList<MapEntry<K, V>> bucket = buckets[index];
		MapEntry<K, V> pair = new MapEntry<K, V>(key, value);
		ListIterator<MapEntry<K, V>> iter = bucket.listIterator();
		boolean found = false;
		while(iter.hasNext()) {
			MapEntry<K, V> tmpPair = iter.next();
			if(tmpPair.getKey().equals(key)) {
				oldValue = tmpPair.getValue();
				iter.set(pair);
				found = true;
				break;
			}
		}
		if(!found)
			bucket.add(pair);
		return oldValue;
	}
	
	@Override
	public V get(Object key) {
		int index = Math.abs(key.hashCode()) % SIZE;
		if(buckets[index] == null) 
			return null;
		for(MapEntry<K, V> pair : buckets[index]) {
			if(pair.getKey().equals(key))
				return pair.getValue();
		}
		return null;
	}
	
	@Override
	public Set<Entry<K, V>> entrySet() {
		Set<Entry<K, V>> set = new HashSet<>();
		for(LinkedList<MapEntry<K, V>> bucket : buckets) {
			if(bucket == null)
				continue;
			for(MapEntry<K, V> pair : bucket) {
				set.add(pair);
			}
		}
		return set;
	}
	
	public static void main(String[] args) {
		SimpleHashMap<String, String> m = new SimpleHashMap<>();
		m.put("lin", "llll");
		m.put("pei", "pppppp");
		m.put("you", "yyyyyou");
		m.put("pei", "peyton");
		m.put("gagag", "waka");
		m.put("lis", "alice");
		System.out.println(m);
		System.out.println(m.get("pei"));
		System.out.println(m.entrySet());
	}
	

}












