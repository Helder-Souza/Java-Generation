package javaGeneration;

import java.util.Scanner;

/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Multiplos3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int num=0, media=0, x=0;
		
		do {
			System.out.printf("Digite um n�mero: ");
			num = ler.nextInt();
			
			if(num%3==0 && num!=0) {
				media = media + num;
				x++;
			}
			
			
		}while(num!=0);
		
		if(x==0) {
			System.out.println("N�o existe divis�o por 0!!!");
		}else {
			media = media/x;
			System.out.println("A m�dia foi: "+media);
		}
		
		
	}

}
