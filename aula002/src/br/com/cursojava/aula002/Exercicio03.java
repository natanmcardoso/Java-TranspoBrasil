package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String [] args){
		
		System.out.println("Calculo do valor de um produto com desconto.\n" );
		
		Scanner produto = new Scanner(System.in);
		
		System.out.printf("Informe o valor do produto: \n");
		double produto1 = Double.parseDouble(produto.nextLine());
		
		System.out.printf("Informe o valor do desconto: \n");
		double desconto = Double.parseDouble(produto.nextLine());
		
		double valorAtualizado = produto1 - (produto1 * desconto)/100;
				
		System.out.printf("O valor do produto %.2f e o valor do desconto %.2f %% \n ", valorAtualizado, desconto);
		
		
		
	}
}
