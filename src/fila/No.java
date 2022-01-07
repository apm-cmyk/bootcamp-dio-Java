package fila;

public class No<T> {
	
	private T conteudoNo;
	private No<T> referenciaNo;
	
	
	public No() {
		
	}
	
	public No(T conteudoNo) {
		this.referenciaNo = null;
		this.conteudoNo = conteudoNo;
	}

	public T getConteudoNo() {
		return conteudoNo;
	}

	public void setConteudoNo(T conteudoNo) {
		this.conteudoNo = conteudoNo;
	}

	public No<T> getReferenciaNo() {
		return referenciaNo;
	}

	public void setReferenciaNo(No<T> referenciaNo) {
		this.referenciaNo = referenciaNo;
	}

	@Override
	public String toString() {
		return "No [conteudoNo=" + conteudoNo + "]";
	}
	
	
	
	

}
