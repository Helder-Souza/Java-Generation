package javaGeneration;

import java.util.Scanner;

/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
public class ForParImpar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int contpar=0, contimpar=0, num, x;
		
		for(x=0;x<10;x++) {
			
			System.out.println("Digite um n�mero: ");
			num = ler.nextInt();
			
			if(num%2==0) {
				contpar ++;
			}else {
				contimpar++;
			}
		}
		
		System.out.println(contpar+" n�meros foram pares, "+contimpar+" n�meros foram impares");
		
	}

}
