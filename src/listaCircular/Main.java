package listaCircular;

public class Main {

	public static void main(String[] args) {
		ListaCircular<String> minhaLista = new ListaCircular<>();
		
		minhaLista.add("C0");
		System.out.println(minhaLista);
		
		minhaLista.remove(0);
		System.out.println(minhaLista);

		minhaLista.add("C0");
		minhaLista.add("C1");
		minhaLista.add("C2");
		minhaLista.add("C3");
		System.out.println(minhaLista);
		System.out.println(minhaLista.get(2));
		System.out.println(minhaLista.get(3));
		System.out.println(minhaLista.get(4));
	
	
		System.out.println("TESTE");
		for(int i=0; i<20; i++) {
			System.out.println(minhaLista.get(i));
		}
	
	}

}
