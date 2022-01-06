package desafio_java_iniciante;

import java.io.IOException;
import java.util.Scanner;

public class pimentoesFeira {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("X = " + (a+b));
	}

}
