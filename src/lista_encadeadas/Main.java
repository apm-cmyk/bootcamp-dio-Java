package lista_encadeadas;

public class Main {

	public static void main(String[] args) {
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

		minhaListaEncadeada.add("teste 1");
		minhaListaEncadeada.add("teste 2");
		minhaListaEncadeada.add("teste 3");
		
		//System.out.println(minhaListaEncadeada.get(0));
		//System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.size());
	}

}
