package equals_hashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Carro> carroLista = new ArrayList<>();

		carroLista.add(new Carro("Marca A"));
		carroLista.add(new Carro("Marca B"));
		carroLista.add(new Carro("Marca C"));
		
		
		//verificar se tem um objeto com a marca A
		System.out.println(carroLista.contains(new Carro("Marca A")));
		
		//verificar se tem um objeto com a marca D
		System.out.println(carroLista.contains(new Carro("Marca D")));
	
		//gerando o hash code 2 vezes
		System.out.println(new Carro("Marca X").hashCode());		
		System.out.println(new Carro("Marca X").hashCode());
		System.out.println(new Carro("Marca Y").hashCode());
		
		//usan o metodo equals
		
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("BMW");
		
		System.out.println(carro1.equals(carro2));
	}

}
