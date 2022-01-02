package estrutura_repeticao_array;

import java.util.Scanner;

public class MaiorMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numero = new int[5];
		double media = 0;
		int maior = Integer.MIN_VALUE;
		int indice = 0;

		// Outras maneiras de usar o for
		/*
		 * for (int i = 0; i < 5; i++) { System.out.println("Digite o número " + i +
		 * ":"); numero[i] = sc.nextInt(); media += numero[i]; }
		 */

		/*
		 * for (int i : numero) { System.out.println("Digite o número " + i + ":");
		 * numero[i] = sc.nextInt(); media += numero[i]; }
		 */

		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite o número " + i + ":");
			numero[i] = sc.nextInt();
			media += numero[i];

			if (numero[i] > maior) {
				maior = numero[i];
				indice = i;
			}
		}

		media /= numero.length;
		System.out.println("Média: " + media);
		System.out.println("Maior: " + maior);
		System.out.println("Indice Maior: " + indice);
	}

}
