package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String [] args){
		System.out.println("Calculo da pot�ncia. \n");
		
		Scanner valor = new Scanner(System.in);
		System.out.printf("Informe o valor: \n");
		double valor2 = Double.parseDouble(valor.nextLine());
		
		
		// double resultado = valor2*valor2; ESSE MODO OU
		
		double resultado = Math.pow(valor2, 3);
				
		System.out.printf("Sua potencia �: %.2f", resultado);
		
		
	}
}
