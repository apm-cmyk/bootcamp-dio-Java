package estrutura_repeticao_array;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {

		Random randon = new Random();
		int[] numeroAleatorio = new int[20];

		for (int i = 0; i < numeroAleatorio.length; i++) {
			numeroAleatorio[i] = randon.nextInt();
		}

		for (int numero : numeroAleatorio) {

			System.out.println(numero);

			System.out.println(numero + 1);
		}
	}

}
