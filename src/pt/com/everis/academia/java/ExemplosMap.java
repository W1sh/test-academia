package pt.com.everis.academia.java;

import java.util.Arrays;
import java.util.HashMap;

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
	}
}
