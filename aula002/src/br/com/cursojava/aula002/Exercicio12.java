package br.com.cursojava.aula002;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String [] args){
		System.out.println("Calculo M�dia. \n");
		
		Scanner media = new Scanner(System.in);
		System.out.printf("Informe a 1� nota: \n");
		double nota1 = Double.parseDouble(media.nextLine());
		
		System.out.printf("Informe a 2� nota: \n");
		double nota2 = Double.parseDouble(media.nextLine());
		
		System.out.printf("Informe a 3� nota: \n");
		double nota3 = Double.parseDouble(media.nextLine());
		
		System.out.printf("Informe a 4� nota: \n");
		double nota4 = Double.parseDouble(media.nextLine());
		
		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (mediaFinal >= 9) {
			System.out.println("Conceito A.");
		}
		else if (mediaFinal >= 8){
			System.out.println("Conceito B.");
		}
		else if (mediaFinal >= 6){
			System.out.println("Conceito C.");
		}
		else if (mediaFinal >= 5) {
		System.out.println("Conceito D.");
		}
		else if (mediaFinal <= 5){
		System.out.println("Insuficiente.");
		}
	}
}

