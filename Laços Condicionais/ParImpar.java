package javaGeneration;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
public class ParImpar {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int num;
		double raiz,pot;
		
		System.out.printf("Digite um n�mero: ");
		num = ler.nextInt();
		
		if(num%2==0) {
			raiz = Math.sqrt(num);
			System.out.printf("O n�mero "+num+" � par e a raiz quadrada dele � %.2f",raiz);
		}else {
			pot = Math.pow(num, 2);
			System.out.println("O n�mero "+num+" � impar e a sua pot�ncia � "+pot);
		}
	}
}
