package javaGeneration;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		consumidor.*/
public class Carro {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		float custof, custoc;
		
		System.out.println("Digite o custo de f�brica: ");
		custof = ler.nextFloat();
		custoc = custof + (custof*28/100) + (custof*45/100);
		System.out.println("O custo do carro ao consumidor ser� de: "+custoc);
	}
}
