package pt.com.everis.academia.java;

import java.util.Arrays;

public class ExemplosArrays {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		System.out.println(array.toString());
		System.out.println(Arrays.toString(array));
	}
}
