package pt.com.everis.academia.java;

public class ValueOf {

	public static void main(String[] args) {
		System.out.println(Boolean.valueOf(true));
		System.out.println(Boolean.valueOf("true"));

		// ------------ Boxing/Autoboxing ------------
		
		Integer i = new Integer(125);
		Integer j = i;
		System.out.println(i==j);
		i++;
		System.out.println("i = " + i);
		System.out.println(i==j);
		j++;
		System.out.println(i==j);
		System.out.println(i.equals(j));
	}
}
