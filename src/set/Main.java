package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		//set é um conjunto
		
		//criar um conjunto de carro
		
		Set<Carro> hashSet = new HashSet<>(); 
		
		hashSet.add(new Carro("A"));
		hashSet.add(new Carro("B"));
		hashSet.add(new Carro("C"));
		hashSet.add(new Carro("Azul"));
		
		System.out.println(hashSet);
		
		//arvore
		
		Set<Carro> treeSet = new TreeSet<>();
		
		treeSet.add(new Carro("Ford"));
		treeSet.add(new Carro("Chevrolet"));
		treeSet.add(new Carro("BMW"));
		treeSet.add(new Carro("Honda"));
		
		System.out.println(treeSet);
		
	}

}
