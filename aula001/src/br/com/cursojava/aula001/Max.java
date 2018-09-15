package br.com.cursojava.aula001;

public class Max {
	public static void main(String[] args) {
		int a = 3;
		int b = 7;
		int c = 25;
		int d = 10;
		int max = Math.max(a, b);
		int max2 = Math.max(c, d);
		
		max = Math.max(max, max2);
		
		System.out.println(max);
		
	}
}
