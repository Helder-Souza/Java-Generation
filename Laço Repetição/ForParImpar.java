package javaGeneration;

import java.util.Scanner;

/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
public class ForParImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int contpar=0, contimpar=0, num, x;
		
		for(x=0;x<10;x++) {
			
			System.out.println("Digite um número: ");
			num = ler.nextInt();
			
			if(num%2==0) {
				contpar ++;
			}else {
				contimpar++;
			}
		}
		
		System.out.println(contpar+" números foram pares, "+contimpar+" números foram impares");
		
	}

}
