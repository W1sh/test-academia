package pt.com.everis.academia.java;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pessoa {

	private String nome;
	private Integer idade;

	public static void main(String[] args) {
		Queue<Pessoa> queue = new PriorityQueue<>((k1, k2) -> k2.getIdade().compareTo(k1.getIdade()));
		queue.add(new Pessoa("Ana", 18));
		queue.add(new Pessoa("Andreia", 25));
		queue.add(new Pessoa("Andre", 30));
		queue.add(new Pessoa("Antonio", 50));
		queue.add(new Pessoa("Anastacio", 40));

		System.out.println(queue.peek());

		ArrayDeque<Pessoa> deque = new ArrayDeque<>();
		deque.addFirst(new Pessoa("Ana", 18));
		deque.addFirst(new Pessoa("Andreia", 25));
		deque.addLast(new Pessoa("Andre", 30));
		deque.addFirst(new Pessoa("Antonio", 50));
		deque.addFirst(new Pessoa("Anastacio", 40));

		System.out.println(deque.peek());
		System.out.println(deque.getLast());
		System.out.println(deque.getFirst());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}

}
