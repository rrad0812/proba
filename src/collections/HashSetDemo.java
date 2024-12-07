package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
	
		int[] count = {34,22,10,60,30,22};		// Definicija niza integera
		Set<Integer> set = new HashSet<>();		// Deklaracija Set-a integera preko HashSet-a
		
		try {
			for(int i = 0; i < 5; i++) {
				set.add(count[i]);				// Dodavanje u Set integera iz niza integera 
			}
			System.out.println(set);			// Štampa kompletnog Set-a
		}
		catch(Exception e) {}					// Nema e iako je 22 ponovljen!!!
	}
}
