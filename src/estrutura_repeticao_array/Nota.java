package estrutura_repeticao_array;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor entre 0 e 10");
		int valor = sc.nextInt();

		if (valor < 0 || valor > 10) {
			System.out.println("Valor inválido!");
			main(args);
		}
		System.out.println("terminou o programa!");

	}

}
