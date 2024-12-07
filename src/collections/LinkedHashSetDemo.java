package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
	
		int[] count = {34, 22,10,60,30,22};			// niz intedžera
		Set<Integer> set = new LinkedHashSet<>();	// Set intedžera implementiran preko  LinkedHashSet-a
		
		try {
			for(int i = 0; i < 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);
		}
		
		
		
		catch(Exception e) {}
	}
}