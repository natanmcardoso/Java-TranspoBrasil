package br.com.cursojava.aula001;

public class Min {
	public static void main(String[] args) {
		int a = 10;
		int b = 7;
		int c = 20;
		int d = 30;
		int min = Math.min(a, b);
		int min2 = Math.min(c, d);
				
		min = Math.min(min, min2);

		System.out.println(min);
	}
}

