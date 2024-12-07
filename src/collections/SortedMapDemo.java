package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		//	Create a hash map
		SortedMap<String, Double> map = new TreeMap<>();
		
		// Put elements to the map
		map.put("Zara", Double.valueOf(3434.34));
		map.put("Mahnaz", Double.valueOf(123.22));
		map.put("Ayan", Double.valueOf(1378.00));
		map.put("Daisy", Double.valueOf(99.22));
		map.put("Qadir", Double.valueOf(-19.08));

		// Get a set of the entries
		Set<Map.Entry<String, Double>> set = map.entrySet();

		// Get an iterator
		Iterator<Map.Entry<String, Double>> i = set.iterator();

		// Display elements
		while(i.hasNext()) {
			Map.Entry<String, Double> me = i.next();
			
			// Varijacija: Promena vrednosti SortedMap preko TreeMap!!! 
			me.setValue(me.getValue() * 10);
			
			// Dobijanje vrednosti ključa 
			System.out.print(me.getKey() + ": ");
			
			// Dobijanje vrednosti value
			System.out.println(me.getValue());
		}
	}
}