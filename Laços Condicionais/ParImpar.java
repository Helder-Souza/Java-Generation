package javaGeneration;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
public class ParImpar {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		double raiz,pot;
		
		System.out.printf("Digite um número: ");
		num = ler.nextInt();
		
		if(num%2==0) {
			raiz = Math.sqrt(num);
			System.out.printf("O número "+num+" é par e a raiz quadrada dele é %.2f",raiz);
		}else {
			pot = Math.pow(num, 2);
			System.out.println("O número "+num+" é impar e a sua potência é "+pot);
		}
	}
}
