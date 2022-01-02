package estrutura_repeticao_array;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		int numero = 0;
		int cont = 0;
		int fatorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		numero = sc.nextInt();

		System.out.println("Fatorial de " + numero + " :");

		do {
			fatorial *= (numero - cont);
			cont += 1;
		} while (cont < numero);

		System.out.println(fatorial);

	}

}
