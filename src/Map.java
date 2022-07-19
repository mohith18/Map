import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
		// map

		// Hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Mohith");
		hm.put(2, "Harsha");
		hm.put(3, "Rajesh");

		System.out.println("\nThe elements of Hashmap are ");
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// HashTable

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(4, "Ajay");
		ht.put(5, "Susheer");
		ht.put(6, "Josh");
		ht.put(7, "Praneeth");

		System.out.println("\nThe elements of HashTable are ");
		for (Entry<Integer, String> n : ht.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

		// TreeMap

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Nikhil");
		map.put(9, "Lohitha");
		map.put(10, "Mohan");

		System.out.println("\nThe elements of TreeMap are ");
		for (Entry<Integer, String> l : map.entrySet()) {
			System.out.println(l.getKey() + " " + l.getValue());
		}

	}

}
