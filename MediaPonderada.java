package javaGeneration;

import java.util.Scanner;

public class MediaPonderada {

	/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
	aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
	respectivamente.*/
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		double media, n1, n2, n3;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextDouble();
		
		n1 = n1*2;
		n2 = n2*3;
		n3 = n3*5;
		media = (n1+n2+n3)/10;
		System.out.println("A média foi de: "+media);
	}
	
}
