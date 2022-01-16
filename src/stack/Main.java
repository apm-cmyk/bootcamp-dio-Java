package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		//O stack � uma pilha
		
		Stack<Carro> stackCarro = new Stack<>();
		
		stackCarro.push(new Carro("Marca A"));
		stackCarro.push(new Carro("Marca B"));
		stackCarro.push(new Carro("Marca C"));
		
		//pilha
		System.out.println(stackCarro);
		
		//retira o topo da pilha e mostra 
		System.out.println(stackCarro.pop());
		System.out.println(stackCarro);
		
		//so mostra o topo e n�o tira 
		System.out.println(stackCarro.peek());
		System.out.println(stackCarro);
		
		//testa se lista t� fazia
		System.out.println(stackCarro.empty());		
	}

}
