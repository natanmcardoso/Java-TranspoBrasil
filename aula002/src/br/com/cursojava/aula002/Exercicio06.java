package br.com.cursojava.aula002;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String [] args){
		System.out.println("Calculo da idade em dias. \n");
		
		Scanner idade = new Scanner(System.in);
		System.out.printf("Informe sua idade em dias: \n");
		int idade2 = Integer.parseInt(idade.nextLine());
		
		
		int idadeEmAnos = ( idade2 / 360 );
		int idadeEmMes = ( idade2 %  360 / 30 );
		int idadeEmDia = ( idade2 % 30 );
		
		
		System.out.printf("Sua idade em anos %d \n", idadeEmAnos);
		System.out.printf("Sua idade em meses %d \n", idadeEmMes);		
		System.out.printf("Sua idade em dias %d \n", idadeEmDia);
		
		
	}
}
