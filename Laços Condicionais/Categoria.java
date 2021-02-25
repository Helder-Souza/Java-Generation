package javaGeneration;

import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
public class Categoria {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade;
		String nome;
		System.out.println("Digite o seu nome: ");
		nome = ler.nextLine();
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=18 && idade<25) {
			System.out.println(nome+" sua idade é: "+idade+" anos sua categoria é adulto");
		}else if(idade>=15 && idade<18) {
			System.out.println(nome+" sua idade é: "+idade+" anos sua categoria é juvenil");
		}else if(idade>=10 && idade<15) {
			System.out.println(nome+" sua idade é: "+idade+" anos sua categoria é infantil");
		}else {
			System.out.println(nome+" Categoria Inválida");
		}
	}
}
