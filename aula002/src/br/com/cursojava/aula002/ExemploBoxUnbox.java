package br.com.cursojava.aula002;

public class ExemploBoxUnbox {
	public static void main(String [] args){
		
		//Pr� Java 5 
		int numero = 10;
		 Integer wrapper = new Integer (numero);
		 int num = wrapper.intValue();
		 num++;
		 wrapper = new Integer(num);
		 
		 //P�s Java 5
		 int numero2 = 10;
		 Integer wrapper2 = numero2;
		 wrapper2++;
		 
	}
}
