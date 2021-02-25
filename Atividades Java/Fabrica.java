package javaGeneration;

import java.util.Scanner;

/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
public class Fabrica {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int duracao, min, seg, horas;
		
		System.out.println("Digite a duração do evento em segundos: ");
		duracao = ler.nextInt();
		horas = duracao/3600;
		min = (duracao%3600)/60;
		seg = (duracao%3600)%60;
		
		System.out.println("O evento teve duração de: "+horas+" horas "+min+" minutos "+seg+" segundos");
	}
}
