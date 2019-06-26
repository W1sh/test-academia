package pt.com.everis.academia.java;

import java.util.Arrays;

public class ExemplosArrays {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 4;
		array[2] = 5;
		array[3] = 2;
		array[4] = 3;
		
		Arrays.sort(array);
		
		int[] newArray = Arrays.copyOfRange(array, 1, 3);
		
		System.out.println(array.toString());
		System.out.println(Arrays.toString(array));
	
		System.out.println(Arrays.toString(newArray));
	}
}
