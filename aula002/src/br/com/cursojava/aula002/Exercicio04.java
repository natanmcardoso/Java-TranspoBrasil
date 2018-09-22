package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String [] args){
		System.out.println("Calculo do IMC.\n" );
		
		Scanner imc = new Scanner(System.in);
		
		System.out.printf("Informe o peso: \n");
		double peso = Double.parseDouble(imc.nextLine());
		
		System.out.printf("Informe a altura: \n");
		double altura = Double.parseDouble(imc.nextLine());		
		
		double imc2 = peso/(altura * altura);
		
		System.out.printf("O valor de IMC é %.2f \n", imc2);
		
	}
}
