package javaGeneration;

import java.util.Scanner;

/*Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
public class Vetor2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num[] = new int [6], somapar=0, contimpar=0;
		
		for(int x=0;x<6;x++) {
			
			System.out.println("Digite um n�mero: ");
			num[x] = ler.nextInt();
			
			if(num[x]%2==0) {
				somapar = somapar + num[x];
				System.out.println("N�mero par digitado: "+num[x]);
			}else {
				contimpar++;
				System.out.println("N�mero impar digitado: "+num[x]);
			}
		}
		System.out.println("A soma dos n�meros pares foi de: "+somapar);
		System.out.println(contimpar+" n�meros impares digitados");

	}

}
