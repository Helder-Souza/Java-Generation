package javaGeneration;

import java.util.Scanner;

/*Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num[] = new int [6], somapar=0, contimpar=0;
		
		for(int x=0;x<6;x++) {
			
			System.out.println("Digite um número: ");
			num[x] = ler.nextInt();
			
			if(num[x]%2==0) {
				somapar = somapar + num[x];
				System.out.println("Número par digitado: "+num[x]);
			}else {
				contimpar++;
				System.out.println("Número impar digitado: "+num[x]);
			}
		}
		System.out.println("A soma dos números pares foi de: "+somapar);
		System.out.println(contimpar+" números impares digitados");

	}

}
