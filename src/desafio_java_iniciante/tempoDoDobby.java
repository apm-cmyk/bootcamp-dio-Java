package desafio_java_iniciante;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tempoDoDobby {
	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		int A = 0;
		int N = 0;

		do {
			try {
				System.out.println("Digite N");
				N = leitor.nextInt();
			} catch (InputMismatchException e) {
				leitor.nextLine();
			}

		} while (!((2 <= N) && (N <= 100)));

		do {
			try {
				System.out.println("Digite A");
				A = leitor.nextInt() + leitor.nextInt();
			} catch (InputMismatchException e) {
				leitor.nextLine();
			}
		} while (!((1 <= A) && (A <= 100)));

		if (A > N) {
			System.out.println("Deixa para amanha!");
		} else
			System.out.println("Farei hoje!");

	}

}
