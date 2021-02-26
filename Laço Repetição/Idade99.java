package javaGeneration;

import java.util.Scanner;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
public class Idade99 {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade, j=0, v=0, f=0;
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99) {
			if(idade<=21) {
				j++;
			}else if(idade>50) {
				v++;
			}else {
				f++;
			}
			System.out.printf("Digite sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println(j+" Pessoa(s) com até 21 anos, "+v+" pessoa(s) com mais de 50 anos e "+f+" pessoa(s) com idade que não se enquadra nessa pesquisa");
	}
}
