package javaGeneration;

import java.util.Scanner;

public class Expressao {

	public static void main(String args[]) {
		/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		calcule a seguinte expressão:
		
		, onde*/
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		double r, s, d;
		
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de c: ");
		c = ler.nextInt();
		
		r = Math.pow(a+b, 2);
		s = Math.pow(b+c, 2);
		d = (r+s)/2;
		System.out.println("O valor de d foi: "+d);
	}
}
