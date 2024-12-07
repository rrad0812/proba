package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClearDemo {
	
	public static void main(String[] args) {

		// Create the sorted set
		SortedSet<String> set = new TreeSet<>();
		
		// Add elements to the set
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("d");
		set.add("e");
		set.add("f");
		System.out.println(set);
		
		// remove elements
		set.clear();
		System.out.println(set);
	}
}