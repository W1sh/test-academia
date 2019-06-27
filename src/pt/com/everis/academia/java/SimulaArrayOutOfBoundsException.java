package pt.com.everis.academia.java;

import java.util.ArrayList;
import java.util.List;

public class SimulaArrayOutOfBoundsException {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Valor 001");
		list.add("Valor 002");
		list.add("Valor 003");
		list.add("Valor 004");
		list.add("Valor 005");

		list.get(-1);
	}

}
