package fila;

public class No {
	
	private Object conteudoNo;
	private No referenciaNo;
	
	
	public No() {
		
	}
	
	public No(Object conteudoNo) {
		this.referenciaNo = null;
		this.conteudoNo = conteudoNo;
	}

	public Object getConteudoNo() {
		return conteudoNo;
	}

	public void setConteudoNo(Object conteudoNo) {
		this.conteudoNo = conteudoNo;
	}

	public No getReferenciaNo() {
		return referenciaNo;
	}

	public void setReferenciaNo(No referenciaNo) {
		this.referenciaNo = referenciaNo;
	}

	@Override
	public String toString() {
		return "No [conteudoNo=" + conteudoNo + "]";
	}
	
	
	
	

}
