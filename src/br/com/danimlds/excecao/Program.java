package br.com.danimlds.excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		System.out.println("METHOD2 START!");
		method1();
		System.out.println("Fim do programa!");
	}
	
	public static void method1() {
		System.out.println("METHOD1 START!");
		method2();
		System.out.println("METHOD1 END!");
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		try {
		String [] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Posi��o Inv�lida!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("Valor Inv�lido, entre com um n�mero v�lido!");
		}
		System.out.println("METHOD2 END!");
		sc.close();		
	}
}