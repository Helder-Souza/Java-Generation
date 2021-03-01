package javaGeneration;

import java.util.Scanner;

/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.*/
public class Matriz2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float m1[][] = new float[2][2], m2[][] = new float[2][2],ms[][] = new float[2][2];
		int opcao, constante;

		
		for(int l=0;l<2;l++) {
			for(int c=0;c<2;c++) {
				System.out.println("Digite o número: ");
				m1[l][c] = ler.nextFloat();
			}
		}
		
		System.out.println("\nMatriz 2 \n");
		
		for (int l=0;l<2;l++) {
			for(int c=0;c<2;c++) {
				System.out.println("Digite o número: ");
				m2[l][c] = ler.nextFloat();
			}
		}
		
		
		System.out.println("Menu de opções:\n"
				+ "(1) somar as duas matrizes\n"
				+ "(2) subtrair a primeira matriz da segunda\n"
				+ "(3) adicionar uma constante as duas matrizes\n"
				+ "(4) imprimir as matrizes");
		System.out.println("Digite sua opção: ");
		opcao = ler.nextInt();
		
		if(opcao == 1) {
			System.out.println("Soma das matrizes");
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					ms[l][c] = m1[l][c] + m2[l][c];
					System.out.print(ms[l][c]+" \t");
				}
				System.out.println();
			}
			
		}else if(opcao == 2) {
			System.out.println("Subtração das matrizes");
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					ms[l][c] = m2[l][c] - m1[l][c];
					System.out.print(ms[l][c]+" \t");
				}
				System.out.println();
			}
		}else if(opcao == 3) {
			System.out.println("Digite o valor da constante: ");
			constante = ler.nextInt();
			System.out.println("Adicão de constante às matrizes");
			System.out.println("\n Matriz 1 \n");
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					m1[l][c] = m1[l][c]+constante;
					System.out.print(m1[l][c]+" \t");
				}
				System.out.println();
			}
			System.out.println("\n Matriz 2\n");
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					m2[l][c] = m2[l][c]+constante;
					System.out.print(m2[l][c]+" \t");
				}
				System.out.println();
			}
		}else if(opcao == 4) {
			System.out.println("Imprimindo as matrizes...\n");
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					System.out.print(m1[l][c]+" \t");
				}
				System.out.println();
			}
			System.out.println("\nMatriz 2 \n");
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					System.out.print(m2[l][c]+" \t");
				}
				System.out.println();
			}
		}else {
			System.out.println("Opção inválida");
		}
	}

}
