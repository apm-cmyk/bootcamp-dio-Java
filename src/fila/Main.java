package fila;

public class Main {

	public static void main(String[] args) {
		
		Fila<String> minhaFila = new Fila<String>();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarta");
		
		System.out.println(minhaFila);
		System.out.println(minhaFila.first());
		System.out.println(minhaFila.dequeue());
		System.out.println(minhaFila.first());
		System.out.println(minhaFila);
		
		minhaFila.enqueue("APM");
		System.out.println(minhaFila);
		
	}

}
