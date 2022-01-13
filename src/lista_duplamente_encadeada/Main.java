package lista_duplamente_encadeada;

public class Main {

	public static void main(String[] args) {
	
		ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
		
		minhaLista.add("a1");
		minhaLista.add("a2");
		minhaLista.add("a3");
		minhaLista.add("a4");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(2);
		
		System.out.println(minhaLista);
		
		minhaLista.add(2,"troca");
		
		System.out.println(minhaLista);
		
	}

}
