package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		//Queue é uma lista
		
		Queue<Carro> queueCarro = new LinkedList<>();
		
		queueCarro.add(new Carro("A"));
		queueCarro.add(new Carro("B"));
		queueCarro.add(new Carro("C"));
		
		System.out.println(queueCarro.add(new Carro("D")));
		System.out.println(queueCarro);
		
		//offer é diferente de add pq o add se não conseguir adicionar ele dá erro
		//o offer da false
		System.out.println(queueCarro.offer(new Carro("D")));
		System.out.println(queueCarro);
		
		//peek pega o primeiro elemento da fila e não remove
		System.out.println(queueCarro.peek());
		System.out.println(queueCarro);
		
		//o poll pega o primeiro elemento da fila e remove
		System.out.println(queueCarro.poll());
		System.out.println(queueCarro);
	
		//isempty verificar se a lista está vazio
		System.out.println(queueCarro.isEmpty());
		
		//Size verificar tamanho
		System.out.println(queueCarro.size());
		
	}

}
