package br.com.danimlds.excecao;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
			
		geraErro1();
		
		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM!");
	}
	//Excecao n�o checada ou n�o verificada, n�o � obrigado a tratar
	static void geraErro1() {
		new RuntimeException("Erro01");
	}
	//Excecao chegada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Erro02");
	}
}
