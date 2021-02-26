package javaGeneration;

import java.util.Scanner;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Multiplos3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num=0, media=0, x=0;
		
		do {
			System.out.printf("Digite um número: ");
			num = ler.nextInt();
			
			if(num%3==0 && num!=0) {
				media = media + num;
				x++;
			}
			
			
		}while(num!=0);
		
		if(x==0) {
			System.out.println("Não existe divisão por 0!!!");
		}else {
			media = media/x;
			System.out.println("A média foi: "+media);
		}
		
		
	}

}
