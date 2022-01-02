package estrutura_repeticao_array;

import java.util.Scanner;

public class OrdemInversa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a qt numeros");
		int qt = sc.nextInt();
		int[] vetor = new int[qt];

		for (int i = 0; i < vetor.length; i++) {

			System.out.println("Indice: " + i + " - Numero: ");
			vetor[i] = sc.nextInt();
		}

		for (int i = vetor.length - 1; i > 0; i--) {

			System.out.println("Indice: " + i + " - Numero: " + vetor[i]);
		}

	}

}
