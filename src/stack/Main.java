package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		//O stack é uma pilha
		
		Stack<Carro> stackCarro = new Stack<>();
		
		stackCarro.push(new Carro("Marca A"));
		stackCarro.push(new Carro("Marca B"));
		stackCarro.push(new Carro("Marca C"));
		
		//pilha
		System.out.println(stackCarro);
		
		//retira o topo da pilha e mostra 
		System.out.println(stackCarro.pop());
		System.out.println(stackCarro);
		
		//so mostra o topo e não tira 
		System.out.println(stackCarro.peek());
		System.out.println(stackCarro);
		
		//testa se lista tá fazia
		System.out.println(stackCarro.empty());		
	}

}
