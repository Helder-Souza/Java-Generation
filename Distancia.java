package javaGeneration;

import java.util.Scanner;

public class Distancia {

	/*Construa um programa em c que, tendo como dados de entrada dois pontos
	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
	
	que efetua tal cálculo é:*/
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		double x1,x2,y1,y2,d;
		
		System.out.println("Digite o ponto x1: ");
		x1 = ler.nextInt();
		System.out.println("Digite o ponto x2: ");
		x2 = ler.nextInt();
		System.out.println("Digite o ponto y1: ");
		y1 = ler.nextInt();
		System.out.println("Digite o ponto y2: ");
		y2 = ler.nextInt();
		
		d = Math.sqrt(Math.pow((x2-x1), 2.0)+ Math.pow((y2-y1), 2.0));
		System.out.printf("A distância entre os dois pontos é igual a: %.2f",d);
	}
}
