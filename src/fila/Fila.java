package fila;

public class Fila<T> {

	private No<T> entradaFila;

	public Fila() {
		this.entradaFila = null;
	}

	public void enqueue(T obj){
		No<T> novoNo = new No<T> (obj);
		novoNo.setReferenciaNo(entradaFila);
		entradaFila = novoNo;
	}

	public T dequeue() {
		if (!this.isEmpty()) {
			No<T> primeiroNo = entradaFila;
			No<T> noAuxiliar = entradaFila;
			while (true) {
				if (primeiroNo.getReferenciaNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getReferenciaNo();
				} else {
					noAuxiliar.setReferenciaNo(null);
					break;
				}
			}
			return (T) primeiroNo.getConteudoNo();
		} else {
			return null;
		}
	}

	public T first() {
		if (!this.isEmpty()) {
			No<T> primeiroNo = entradaFila;
			while (true) {
				if (primeiroNo.getReferenciaNo() != null) {
					primeiroNo = primeiroNo.getReferenciaNo();
				} else {
					break;
				}
			}
			return primeiroNo.getConteudoNo();
		} else {
			return null;
		}
	}

	public boolean isEmpty() {
		return entradaFila == null ? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = " ";
		No<T> noAuxiliar = entradaFila;

		if (entradaFila != null) {
			while (true) {
				stringRetorno += "[No{object=" + noAuxiliar.getConteudoNo() + "}] -----> ";
				if (noAuxiliar.getReferenciaNo() != null) {
					noAuxiliar = noAuxiliar.getReferenciaNo();
				}else {
					stringRetorno +="null";
					break;
				}
			}
		} else {
			stringRetorno = "null";
		}
		return stringRetorno;
	}

}
