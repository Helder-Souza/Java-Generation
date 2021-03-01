package javaGeneration;

import java.util.Scanner;

/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
public class Matriz1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int matriz[][] = new int[3][3], cont10=0;
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				System.out.println("Digite um número: ");
				matriz[l][c] = ler.nextInt();
				if(matriz[l][c]>10) {
					cont10++;
				}
			}
		}
		
		System.out.printf("\t \t Matriz\n");
		
		for(int l=0;l<3;l++) {
			for(int c=0;c<3;c++) {
				System.out.printf("\t %d \t", matriz[l][c]);
			}
			System.out.println();
		}
		
		System.out.println("\nA matriz possuí "+ cont10+ " valores maiores que 10");

	}

}
