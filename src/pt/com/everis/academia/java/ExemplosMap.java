package pt.com.everis.academia.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class ExemplosMap {

	public static void main(String[] args) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("A", "1");
		map.put("B", Arrays.asList("1", "2"));

		System.out.println(map);
		map.clear();
		System.out.println(map);

		map.put("A", "1");
		map.put("B", Arrays.asList("1", "2"));

		System.out.println("A -> " + map.get("A"));
		System.out.println("B -> " + map.get("B"));

		Hashtable<String, Object> table = new Hashtable<>();
		table.put("A", "1");
		table.put("B", Arrays.asList("1", "2"));

		System.out.println(table.contains("1"));
		System.out.println(table.containsKey("A"));

		table.remove("A");
		System.out.println(table);
	}
}
