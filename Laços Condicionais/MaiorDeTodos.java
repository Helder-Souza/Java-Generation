package javaGeneration;

import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
public class MaiorDeTodos {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3,m=0;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = ler.nextInt();
		
		if(n1>n2 &&n1>n3) {
			System.out.println("O primeiro n�mero foi: "+n1+" e ele foi o maior n�mero digitado");
		}else if(n2>n1 && n2>n3) {
			System.out.println("O segundo n�mero foi: "+n2+" e ele foi o maior n�mero digitado");
		}else if(n3>n1 && n3>n2) {
			System.out.println("O terceiro n�mero foi: "+n3+" e ele foi o maior n�mero digitado");
		}else if(n1==n2 || n1==n3) {
			System.out.println("O primeiro n�mero foi: "+n1+" e ele foi o maior n�mero digitado");
		}else if(n2==n1 || n2==n3) {
			System.out.println("O segundo n�mero foi: "+n2+" e ele foi o maior n�mero digitado");
		}else if(n3==n1 || n3==n2) {
			System.out.println("O terceiro n�mero foi: "+n3+" e ele foi o maior n�mero digitado");
		}
	}
}
