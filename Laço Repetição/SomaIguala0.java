package javaGeneration;

import java.util.Scanner;

/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class SomaIguala0 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num, soma=0;
		
		
		do {
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			soma = soma+num;
			
		}while(num!=0);
		
		System.out.println("A soma total foi: "+soma);
		
	}

}
