package javaGeneration;

import java.util.Scanner;

/*Faça um programa que entre com três números e coloque em ordem crescente.*/
public class Crescente {

	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3,tr;
		
		System.out.println("Digite o número: ");
		n1 = ler.nextInt();
		System.out.println("Digite o número: ");
		n2 = ler.nextInt();
		System.out.println("Digite o número: ");
		n3 = ler.nextInt();
		
		if(n1>n2) {
			tr = n1;
			n1 = n2;
			n2 = tr;
		}if(n2<=n3) {
			System.out.printf("a ordem é %d %d %d", n1,n2,n3);
		}
		else if (n1<=n3)
		{
			System.out.printf("a ordem é %d %d %d", n1,n3,n2);
		}
		else 
		{
			System.out.printf("a ordem é %d %d %d", n3,n1,n2);
		}
	}
}
