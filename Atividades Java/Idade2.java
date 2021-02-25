package javaGeneration;

import java.util.Scanner;

public class Idade2 {

	public static void main(String args[]) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.*/
		
		Scanner ler = new Scanner(System.in);
		int idade, dias, meses, anos;
		
		System.out.println("Digite sua idade em dias: ");
		idade = ler.nextInt();
		
		anos = idade/365;
		meses = (idade%365)/30;
		dias = (idade%365)%30;
		System.out.println("Sua idade é: "+anos+" ano(s) "+meses+" meses e "+dias+" dias");
	}
}
