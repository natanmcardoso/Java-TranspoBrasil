package br.com.cursojava.aula002;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String [] args){
		System.out.println("Idade para tirar CNH. \n");
		
		Scanner idade = new Scanner(System.in);
		System.out.printf("Informe sua idade: \n");
		int idade1 = Integer.parseInt(idade.nextLine());
		
				
		if (idade1 >=18) {
			System.out.println("Parab�ns, voc� pode tirar a CNH.");
		}
		else {
			System.out.println("Infelizmente voc� n�o tem idade para tirar a CNH.");
		}
		
	}
}
