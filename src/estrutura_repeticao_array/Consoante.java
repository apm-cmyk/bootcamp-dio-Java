package estrutura_repeticao_array;

import java.util.Scanner;

public class Consoante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String letra = null;
		String[] consoante = new String[6];
		String[] vogal = new String[6];
		int qtConsoantes = 0;
		int qtVogal = 0;

		for (int i = 0; i < 6; i++) {

			System.out.println("Digite");

			letra = sc.next();
			if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
					| letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
				qtConsoantes++;
				consoante[i] = letra;
			} else {
				qtVogal++;
				vogal[i] = letra;
			}
		}

		System.out.println("Consoantes:");
		for (int i = 0; i < 6; i++) {

			if (consoante[i] != null) {
				System.out.println(consoante[i]);
			}

		}

		System.out.println("Vogais:");
		for (int i = 0; i < 6; i++) {

			if (vogal[i] != null) {
				System.out.println(vogal[i]);
			}

		}

		System.out.println("Qt consoantes: " + qtConsoantes);
		System.out.println("Qt vogal: " + qtVogal);

	}

}
