package pt.com.everis.academia.java;

import java.util.Arrays;

public class Pai implements Comparable<Pai>{
	
	private Integer id;
	
	public Pai() {
		super();
	}

	public Pai(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		Pai[] pais = new Pai[5];
		pais[0] = new Pai(2);
		pais[1] = new Pai(1);
		pais[2] = new Pai(4);
		pais[3] = new Pai(5);
		pais[4] = new Pai(3);
		
		Arrays.sort(pais);
		System.out.println(Arrays.toString(pais));
	}

	@Override
	public int compareTo(Pai o) {
		return this.id.compareTo(o.getId());
	}

	@Override
	public String toString() {
		return "Pai [id=" + id + "]";
	}
}
