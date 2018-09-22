package br.com.cursojava.aula002;

public class ExemploBoxUnbox {
	public static void main(String [] args){
		
		//Pré Java 5 
		int numero = 10;
		 Integer wrapper = new Integer (numero);
		 int num = wrapper.intValue();
		 num++;
		 wrapper = new Integer(num);
		 
		 //Pós Java 5
		 int numero2 = 10;
		 Integer wrapper2 = numero2;
		 wrapper2++;
		 
	}
}
