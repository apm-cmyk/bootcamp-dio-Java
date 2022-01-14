package listaCircular;

public class ListaCircular<T> {

	private No<T> cabeça;
	private No<T> cauda;
	private int tamanhoLista;

	public ListaCircular() {
		this.cabeça = null;
		this.cauda = null;
		this.tamanhoLista = 0;
	}

	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		if (this.tamanhoLista == 0) {
			this.cabeça = novoNo;
			this.cauda = this.cabeça;
			this.cabeça.setNoProximo(cauda);
		} else {
			novoNo.setNoProximo(this.cauda);
			this.cabeça.setNoProximo(novoNo);
			this.cauda = novoNo;
		}
		this.tamanhoLista++;
	}

	public void remove(int index) {
		if (index >= this.tamanhoLista)
			throw new IndexOutOfBoundsException("Lista está vazia");
		No<T> noAuxiliar = this.cauda;
		if (index == 0) {
			this.cauda = this.cauda.getNoProximo();
			this.cabeça.setNoProximo(this.cauda);
		} else if (index == 1) {
			this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
		} else {
			for (int i = 0; i < index; i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
			noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
		}
		this.tamanhoLista--;
	}

	public T get(int index) {
		return this.getNo(index).getConteudo();
	}

	private No<T> getNo(int index) {
		if (this.isEmpty())
			throw new IndexOutOfBoundsException("Lista está vazia");

		if (index == 0) {
			return this.cauda;
		}

		No<T> noAuxiliar = this.cauda;
		for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;
	}

	public boolean isEmpty() {
		return this.tamanhoLista == 0 ? true : false;
	}

	public int size() {
		return tamanhoLista;
	}
	
	@Override
	public String toString() {
		String strRetorno ="";
		No<T> noAuxiliar = this.cauda;
		for(int i=0; i<this.size(); i++) {
			strRetorno += "[No{Conteudo = " + noAuxiliar.getConteudo()+" }] --->";
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		
		strRetorno += this.size() != 0 ? "(Retorno ao Inicio)" : "[]";
		
		return strRetorno;
	}
	
	

}
