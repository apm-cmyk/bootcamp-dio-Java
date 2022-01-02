package estrutura_repeticao_array;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {

		int cont = 0;
		int qtPares = 0;
		int qtImpares = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de numeros: ");
		int qtNumero = sc.nextInt();
		int[] vetor = new int[qtNumero];

		do {
			System.out.println("Digite o numero " + (cont + 1) + " do vetor: ");
			vetor[cont] = sc.nextInt();
			
			if (vetor[cont] % 2 == 0) {
				qtPares += 1;
			} else {
				qtImpares += 1;
			}
			
			cont += 1;

			
		} while (cont < qtNumero);

		System.out.println("Número Pares: " + qtPares);
		System.out.println("Número Impares: " + qtImpares);
	}

}
