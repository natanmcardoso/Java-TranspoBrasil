package br.com.cursojava.aula001;

public class CalculoCircuito {
	public static void main(String[] args){
		double diametro = 20;
		double pi = 3.1416; 
		double raio = diametro / 2;
		double area = pi * ( raio * raio); 
		
		System.out.printf("%.2f = %.2f * (%.2f * %.2f)\n",area, pi, raio, raio);
		
		System.out.println("O resultado a área é "+area);
		
	}
}
