package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String [] args){
		System.out.println("Calculo. \n");
		
		Scanner valor = new Scanner(System.in);
		System.out.printf("Informe o valor: \n");
		double valor2 = Double.parseDouble(valor.nextLine());
		
		System.out.printf("Informe o valor: \n");
		double valor3 = Double.parseDouble(valor.nextLine());
		
		System.out.printf("Informe o valor: \n");
		double valor4 = Double.parseDouble(valor.nextLine());
		
		double resultadoMax1 = Math.max(valor2, valor3);
		double resultadoMax2 = Math.max(resultadoMax1, valor4);
		double resultadoMin1 = Math.min(valor2, valor3);
		double resultadoMin2 = Math.min(resultadoMin1, valor3);
		
		System.out.printf("Seu valor menor é: %.2f \n", resultadoMin2);
		System.out.printf("Seu valor maior é: %.2f", resultadoMax2);
		
	}
	
}
