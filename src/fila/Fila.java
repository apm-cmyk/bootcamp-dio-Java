package fila;

public class Fila {

	private No entradaFila;

	public Fila() {
		this.entradaFila = null;
	}

	public void enqueue(No novoNo) {
		novoNo.setReferenciaNo(entradaFila);
		entradaFila = novoNo;
	}

	public No dequeue() {
		if (!this.isEmpty()) {
			No primeiroNo = entradaFila;
			No noAuxiliar = entradaFila;
			while (true) {
				if (primeiroNo.getReferenciaNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getReferenciaNo();
				} else {
					noAuxiliar.setReferenciaNo(null);
					break;
				}
			}
			return primeiroNo;
		} else {
			return null;
		}
	}

	public No first() {
		if (!this.isEmpty()) {
			No primeiroNo = entradaFila;
			while (true) {
				if (primeiroNo.getReferenciaNo() != null) {
					primeiroNo = primeiroNo.getReferenciaNo();
				} else {
					break;
				}
			}
			return primeiroNo;
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
		No noAuxiliar = entradaFila;

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
