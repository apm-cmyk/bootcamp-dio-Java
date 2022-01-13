package lista_encadeadas;

public class ListaEncadeada<T> {

	No<T> referenciaEntrada;

	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}

	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if (this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}

		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i < this.size() - 1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		noAuxiliar = noAuxiliar.getProximoNo();
	}

	public T get(int index) {
		return getNo(index).getConteudo();
	}

	private No<T> getNo(int index) {

		validacao(index);
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		for (int i = 0; i <= index; i++) {
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		return noRetorno;

	}

	public T remove(int index) {
		No<T> noPivor = this.getNo(index);
		if (index == 0) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}

		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}

	public int size() {
		//rever esse metodo não mestá retornando o valor certo
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		while (true) {
			if (referenciaEntrada != null) {
				tamanhoLista++;
				if (referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				} else {
					break;
				}
			} else {
				break;
			}
		}

		return tamanhoLista;
	}

	private void validacao(int index) {
		if (index >= size()) {
			int ultimoIndice = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteudo no indice");
		}
	}

	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}

	@Override
	public String toString() {
		String stRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;

		for (int i = 0; i < this.size(); i++) {
			stRetorno += "[No{conteudo" + noAuxiliar.getConteudo() + "}---->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		stRetorno += "null";

		return stRetorno;
	}

}
