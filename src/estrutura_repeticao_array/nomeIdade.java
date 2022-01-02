package estrutura_repeticao_array;

import java.util.Scanner;

public class nomeIdade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Digite o seu nome");
			String nome = sc.next();
			if (nome.equals("0"))
				break;
			System.out.println("Digite a sua idade");
			int idade = sc.nextInt();
		}

		System.out.println("O programa terminou");
	}

}
