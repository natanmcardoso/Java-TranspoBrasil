package br.com.cursojava.aula002;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String [] args){
		System.out.println("Idade para tirar CNH. \n");
		
		Scanner idade = new Scanner(System.in);
		System.out.printf("Informe sua idade: \n");
		int idade1 = Integer.parseInt(idade.nextLine());
		
				
		if (idade1 >=18) {
			System.out.println("Parabéns, você pode tirar a CNH.");
		}
		else {
			System.out.println("Infelizmente você não tem idade para tirar a CNH.");
		}
		
	}
}
