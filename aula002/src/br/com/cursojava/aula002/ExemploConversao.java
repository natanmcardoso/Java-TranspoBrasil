package br.com.cursojava.aula002;

import java.util.Scanner;

public class ExemploConversao {

	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade:");
		String textoidade = teclado.nextLine();
		
		/* 
		 * texto para n�mero vai usar integer.parseint
		 */
		
		int idade = Integer.parseInt(textoidade);
		
		System.out.println("Sua idade daqui a 20 anos ser�....");
		System.out.println(idade + 20);
		teclado.close();
	}
}
