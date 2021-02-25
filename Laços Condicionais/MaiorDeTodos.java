package javaGeneration;

import java.util.Scanner;

/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
public class MaiorDeTodos {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3,m=0;
		
		System.out.println("Digite o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		n3 = ler.nextInt();
		
		if(n1>n2 &&n1>n3) {
			System.out.println("O primeiro número foi: "+n1+" e ele foi o maior número digitado");
		}else if(n2>n1 && n2>n3) {
			System.out.println("O segundo número foi: "+n2+" e ele foi o maior número digitado");
		}else if(n3>n1 && n3>n2) {
			System.out.println("O terceiro número foi: "+n3+" e ele foi o maior número digitado");
		}else if(n1==n2 || n1==n3) {
			System.out.println("O primeiro número foi: "+n1+" e ele foi o maior número digitado");
		}else if(n2==n1 || n2==n3) {
			System.out.println("O segundo número foi: "+n2+" e ele foi o maior número digitado");
		}else if(n3==n1 || n3==n2) {
			System.out.println("O terceiro número foi: "+n3+" e ele foi o maior número digitado");
		}
	}
}
