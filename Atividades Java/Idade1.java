package javaGeneration;

import java.util.Scanner;

public class Idade1 {

	public static void main(String args[]) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
		dias e mostre-a expressa apenas em dias.*/
		Scanner ler = new Scanner(System.in);
		int idade, anos, meses, dias;
		
		System.out.println("Digite sua idade em anos: ");
		anos = ler.nextInt();
		System.out.println("Digite a quantidade de meses que se passaram do seu aniversário: ");
		meses = ler.nextInt();
		System.out.println("Digite a diferença dos dias: ");
		dias = ler.nextInt();
		
		anos = anos*365;
		meses = meses*30;
		idade = anos+meses+dias;
		
		System.out.println("sua idade em dias é de: "+idade);
	}
}
