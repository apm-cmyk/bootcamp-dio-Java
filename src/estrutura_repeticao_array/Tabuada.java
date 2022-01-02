package estrutura_repeticao_array;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		int numero = 0;
		int cont = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da tabuada: ");
		numero = sc.nextInt();

		if (numero < 0 || numero > 10) {
			System.out.println("Escolha um número entre 0-10");
			main(args);
		} else {

			System.out.println("TABUADA DE " + numero);
			while (cont <= 10) {
				System.out.println(numero + " X " + cont + " = " + (numero * cont));
				cont += 1;
			}
		}

	}

}
