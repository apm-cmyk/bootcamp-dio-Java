package list_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> listaCarro = new ArrayList<>();
		
		listaCarro.add(new Carro("A"));
		listaCarro.add(new Carro("B"));
		listaCarro.add(new Carro("C"));
		
		//verificar se a lista de carro contém o carro A
		System.out.println(listaCarro.contains(new Carro("A")));
		
		//pegar o carro na posicao 1
		System.out.println(listaCarro.get(1));
		
		//Saber qual indice esta o carro C
		System.out.println(listaCarro.indexOf(new Carro("C")));
		
		//Vai retornar -1 pq esse carro não existe
		System.out.println(listaCarro.indexOf(new Carro("X")));
		
		//metodo remove vai remover o B
		System.out.println(listaCarro.remove(1));
		System.out.println(listaCarro);

	}

}
