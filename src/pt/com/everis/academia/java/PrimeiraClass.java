package pt.com.everis.academia.java;

public class PrimeiraClass {

	public static void main(String[] args){
		System.out.println("Nossa primeira classe");
		
		long lo = 91919191919191L;
		int in = (int) lo;
		System.out.println(in);
		
		// ------------ Wrappers Ex 1 ------------
		
		Boolean b = new Boolean(true);
		Boolean b2 = new Boolean("false");
		
		byte by1 = 100;
		Byte by2 = new Byte(by1);
		Byte by3 = new Byte("100");
		
		Character c = new Character('a');
		
		Double d = new Double(5.0);
		Double d2 = new Double("5.0");
		
		Float f = new Float(5.0);
		Float f2 = new Float(5.0f);
		Float f3 = new Float("5.0");
		
		Integer i = new Integer(1);
		Integer i2 = new Integer("1");
		
		Long l = new Long(1L);
		Long l2 = new Long("1000");
		
		short s1 = 100;
		Short s2 = new Short(s1);
		Short s3 = new Short("100");
		
		// ------------ Wrappers Ex 2 ------------
		
		Double d3 = new Double(6.333);
		System.out.println(d3.byteValue());
		System.out.println(d3.doubleValue());
		System.out.println(d3.floatValue());
		System.out.println(d3.intValue());
		System.out.println(d3.longValue());
		System.out.println(d3.shortValue());
		
	}
}
