package estrutura_dados;

public class No<T> {

	private T no;
	private No<T> proximoNo;

	public No(T no) {
		this.setProximoNo(null);
		this.no = no;
	}

	public T getNo() {
		return no;
	}

	public void setNo(T no) {
		this.no = no;
	}

	public No<T> getProximoNo() {
		return proximoNo;
	}

	public void setProximoNo(No<T> proximoNo) {
		this.proximoNo = proximoNo;
	}

	@Override
	public String toString() {
		return " " +no;
	}


}
