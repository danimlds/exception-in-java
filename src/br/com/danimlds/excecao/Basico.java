package br.com.danimlds.excecao;

public class Basico {
	public static void main(String[] args) {
		Aluno aluno = null;
		try {
			imprimirNomeDoAluno(aluno);
		}catch(NullPointerException e) {
			System.out.println("Ocorreu o erro: " +e.getMessage());
		}
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " +e.getMessage());
		}
		
		System.out.println("fim!");
	}
	
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
