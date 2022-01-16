package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> aluno1 = new HashMap<>();

		aluno1.put("Nome", "Joao");
		aluno1.put("Media", "7.8");
		aluno1.put("Turma", "A1");

		System.out.println(aluno1);

		// chave do grupo
		System.out.println(aluno1.keySet());

		// valores das chaves
		System.out.println(aluno1.values());

		// Podemos ter uma lista de maps
		List<Map<String, String>> listaAlunos = new ArrayList<>();

		listaAlunos.add(aluno1);
		
		//Criando o aluno 2
		Map<String, String> aluno2 = new HashMap<>();

		aluno2.put("Nome", "Maria");
		aluno2.put("Media", "8.1");
		aluno2.put("Turma", "A2");
		
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		//testar se a estrutura map tem determinada chave
		System.out.println(aluno1.containsKey("Nome"));
		
	}

}
