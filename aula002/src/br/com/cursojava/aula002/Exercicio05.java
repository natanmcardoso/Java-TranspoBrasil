package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String [] args){
		System.out.println("Calculo sobre a idade em dias \n");
		
		Scanner idade = new Scanner(System.in);
		System.out.printf("Informe a idade: \n");
		int idade2 = Integer.parseInt(idade.nextLine());
		
		int resultado = idade2 * 365;
		
		System.out.printf("Sua idade em dias s�o: %d \n", resultado);
		
		
		
	}
	
}
