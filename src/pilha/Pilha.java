package pilha;

public class Pilha {

	private No noEntradaPilha;

	public Pilha() {
		this.noEntradaPilha = null;
	}

	public boolean isEmpty() {
		return noEntradaPilha == null ? true : false;
	}

	public No top() {
		return noEntradaPilha;
	}

	public void push(No noNovo) {
		No referenciaEntrada = noEntradaPilha;
		noEntradaPilha = noNovo;
		noEntradaPilha.setReferenciaNo(referenciaEntrada);
	}

	public No pop() {
		if (!this.isEmpty()) {
			No noPoped = noEntradaPilha;
			noEntradaPilha = noEntradaPilha.getReferenciaNo();
			return noPoped;

		} else {
			return null;
		}

	}

	@Override
	public String toString() {
		String stringRetorno = "------------\n";
		stringRetorno += "   Pilha\n";
		stringRetorno += "------------\n";
		No noAuxiliar = noEntradaPilha;

		while (true) {
			if (noAuxiliar != null) {

				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getReferenciaNo();
			} else {
				break;
			}
		}

		stringRetorno += "============\n";
		return stringRetorno;
	}

}
