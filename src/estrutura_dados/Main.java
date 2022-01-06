package estrutura_dados;

public class Main {

	public static void main(String[] args) {
		
		No<String> no1 = new No<String>("No1");
		No<String> no2 = new No<String>("No2");
		No<String> no3 = new No<String>("No3");
		
		no1.setProximoNo(no2);
		no2.setProximoNo(no3);
		
		System.out.println("Proximo no1: "+no1.getProximoNo());
		System.out.println("Proximo no2: "+no2.getProximoNo());
		System.out.println("Proximo no3: "+no3.getProximoNo());
	}

}
